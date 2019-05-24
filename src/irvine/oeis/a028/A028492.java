package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028492.
 * @author Sean A. Irvine
 */
public class A028492 implements Sequence {

  // Based loosely on some Python code by Anthony Wharton

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<ArrayList<Long>> seenSides = new HashSet<>();
    // (x,y) = y * mN + x
    long cnt = 0;
    final int lim = mN * mN;
    for (int a = 0; a < lim; ++a) {
      final int ax = a % mN;
      final int ay = a / mN;
      for (int b = a + 1; b < lim; ++b) {
        final int bx = b % mN;
        final int by = b / mN;
        for (int c = b + 1; c < lim; ++c) {
          final int cx = c % mN;
          final int cy = c / mN;
          long area2 = (bx - ax) * (cy - ay) - (cx - ax) * (by - ay);
          if (area2 == 0) {
            continue;
          }
          final long[] sidesSquared = {
            (bx - ax) * (bx - ax) + (by - ay) * (by - ay),
            (cx - ax) * (cx - ax) + (cy - ay) * (cy - ay),
            (bx - cx) * (bx - cx) + (by - cy) * (by - cy),
          };
          Arrays.sort(sidesSquared);
          final long gcd = LongUtils.gcd(sidesSquared[0], sidesSquared[1], sidesSquared[2]);
          final ArrayList<Long> ss = new ArrayList<>(3);
          ss.add(sidesSquared[0] / gcd);
          ss.add(sidesSquared[1] / gcd);
          ss.add(sidesSquared[2] / gcd);
          if (seenSides.add(ss)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
