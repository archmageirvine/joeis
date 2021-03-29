package irvine.oeis.a045;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A045951.
 * @author Sean A. Irvine
 */
public class A045951 implements Sequence {

  private long mN = 0;
  private long mC = 0;
  private final HashSet<Triple<Long>> mA = new HashSet<>();

  private void search(final long a, final long b, final long c, final long n) {
    if (n > mN) {
      if (a + b == c) {
        //System.out.println("  " + n + ": " + a + " + " + b + " = " + c);
        mA.add(a < b ? new Triple<>(a, b, c) : new Triple<>(b, a, c));
        if (a < b) {
          ++mC;
        }
      }
      return;
    }
    // Initial zeros used to ensure sets are nonempty // todo no longer needed empty products allowed
    search(a == 0 ? n : a * n, b, c, n + 1);
    if (a != 0) { // partially break symmetry
      search(a, b == 0 ? n : b * n, c, n + 1);
    }
    search(a, b, c == 0 ? n : c * n, n + 1);
  }

  @Override
  public Z next() {
    ++mN;
    mA.clear();
    mC = 0;
    search(1, 1, 0, 1);
    System.out.println("Count was " + mC + " " + mC / 3);
    return Z.valueOf(mA.size());
  }
}
