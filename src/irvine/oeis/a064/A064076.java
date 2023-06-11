package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;

/**
 * A064076 Lesser of odd twin prime powers (greater = A064077).
 * @author Sean A. Irvine
 */
public class A064076 extends Sequence1 {

  private final Sequence mA = new FilterSequence(new A000961(), Z::isOdd);
  {
    mA.next(); // skip 1
  }
  private Z mP = mA.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = mA.next();
      if (mP.subtract(q).equals(Z.TWO)) {
        return q;
      }
    }
  }
}
