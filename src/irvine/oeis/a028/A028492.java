package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028492 Similarity classes of triangles which can be drawn using the lattice points in an n X n grid for vertices.
 * @author Sean A. Irvine
 */
public class A028492 extends Sequence0 {

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
          final long area2 = (long) (bx - ax) * (cy - ay) - (long) (cx - ax) * (by - ay);
          if (area2 == 0) {
            continue;
          }
          final long s0 = (long) (bx - ax) * (bx - ax) + (long) (by - ay) * (by - ay);
          final long s1 = (long) (cx - ax) * (cx - ax) + (long) (cy - ay) * (cy - ay);
          final long s2 = (long) (bx - cx) * (bx - cx) + (long) (by - cy) * (by - cy);
          final long gcd = LongUtils.gcd(s0, s1, s2);
          final ArrayList<Long> ss = new ArrayList<>(3);
          ss.add(s0 / gcd);
          ss.add(s1 / gcd);
          ss.add(s2 / gcd);
          Collections.sort(ss);
          if (seenSides.add(ss)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
