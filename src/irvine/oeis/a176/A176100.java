package irvine.oeis.a176;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a141.A141468;

/**
 * A176100 Even numbers that are not semiprimes, or, twice the nonprimes.
 * @author Georg Fischer
 */
public class A176100 extends Sequence1 {

  final Sequence mA141468 = new A141468();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA141468.next());
  }

}
