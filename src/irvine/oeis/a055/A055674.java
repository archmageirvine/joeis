package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055674 a(n) = least nonnegative integer h such that (n,h) is not collinear with any 2 points in the set S(n-1) := {(m,a(m)), (m,b(m)): m = 0,1,...,n-1} for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A055674 extends Sequence0 {

  private final List<Long> mA = new ArrayList<>();
  protected final List<Long> mB = new ArrayList<>();
  private int mN = -1;

  private boolean isCollinear(final long x, final long y) {
    //System.out.println("Testing: (" + x + "," + y + ")");
    for (int k = 0; k < mA.size(); ++k) {
      final Long a = mA.get(k);
      for (int j = 0; j < k; ++j) {
        final Long b = mA.get(j);
        if ((b - a) * (x - j) == (y - b) * (j - k)) {
          return true;
        }
      }
    }
    for (int k = 0; k < mB.size(); ++k) {
      final Long a = mB.get(k);
      for (int j = 0; j < k; ++j) {
        final Long b = mB.get(j);
        if ((b - a) * (x - j) == (y - b) * (j - k)) {
          return true;
        }
      }
    }
    for (int k = 0; k < mA.size(); ++k) {
      final Long a = mA.get(k);
      for (int j = 0; j < mB.size(); ++j) {
        final Long b = mB.get(j);
        if ((b - a) * (x - j) == (y - b) * (j - k)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long h = -1;
    while (isCollinear(mN, ++h)) {
      // do nothing
    }
    mA.add(h);
    if (mB.isEmpty()) {
      mB.add(1L);
    } else {
      h = -1;
      while (isCollinear(mN, ++h)) {
        // do nothing
      }
      mB.add(h);
    }
    //System.out.println("mA: " + mA);
    //System.out.println("mB: " + mB);
    return Z.valueOf(mA.get(mN));
  }
}
