package irvine.oeis.a225;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a030.A030057;
/**
 * A225561 Largest number m such that 1, 2, ..., m can be represented as the sum of distinct divisors of n.
 * @author Georg Fischer
 */
public class A225561 extends Sequence1 {

  private final Sequence mA030057 = new A030057();
  @Override
  public Z next() {
    return mA030057.next().subtract(Z.ONE);
  }

}
