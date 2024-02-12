package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;
import irvine.oeis.a025.A025475;

/**
 * A068343 a(n) is a prime power and sum of all prime powers &lt;= a(n) is A025475.
 * @author Sean A. Irvine
 */
public class A068343 extends Sequence1 {

  private final Sequence mA = new A000961();
  private final Sequence mB = new A025475();
  private Z mSum = Z.ZERO;
  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z a = mA.next();
      mSum = mSum.add(a);
      while (mT.compareTo(mSum) < 0) {
        mT = mB.next();
      }
      if (mSum.equals(mT)) {
        return a;
      }
    }
  }
}

