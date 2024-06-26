package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a087.A087156;

/**
 * A163300 Even numbers without 2.
 * @author Georg Fischer
 */
public class A163300 extends Sequence1 {

  final Sequence mA087156 = new A087156();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA087156.next());
  }

}
