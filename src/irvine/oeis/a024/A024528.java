package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a008.A008578;

/**
 * A024528.
 * @author Sean A. Irvine
 */
public class A024528 extends A008578 {

  private Q mSum = Q.ZERO;
  private Sequence mA2110 = new A002110();

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.multiply(mA2110.next()).num();
  }
}
