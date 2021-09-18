package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A051533 Numbers that are the sum of two positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A051533 extends A000217 {

  {
    super.next(); // skip 0
  }
  private Z mT = super.next();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mT)) {
        final Sequence t = new A000217();
        t.next();
        Z u;
        do {
          u = t.next();
          mA.add(mT.add(u));
        } while (!u.equals(mT));
        mT = super.next();
      }
      if (mA.remove(mN)) {
        return mN;
      }
    }
  }
}
