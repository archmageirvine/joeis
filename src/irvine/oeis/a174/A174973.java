package irvine.oeis.a174;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a047.A047836;

/**
 * A174973 Numbers whose divisors increase by a factor of at most 2.
 * @author Georg Fischer
 */
public class A174973 extends Sequence1 {

  final Sequence mA047836 = new A047836();
  @Override
  public Z next() {
    return mA047836.next().divide(Z.TWO);
  }

}
