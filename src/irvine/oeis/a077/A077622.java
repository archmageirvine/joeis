package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A077622 Number of numbers &lt;= prime(n)# having n prime factors (with multiplicity), where prime(n)# = A002110(n) is the n-th primorial.
 * @author Sean A. Irvine
 */
public class A077622 extends Sequence1 {

  private final Sequence mPrimorial = new A002110().skip();
  private final DirectSequence mA = new A077618();

  @Override
  public Z next() {
    return mA.a(mPrimorial.next());
  }
}
