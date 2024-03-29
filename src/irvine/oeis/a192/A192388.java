package irvine.oeis.a192;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A192388 a(n) = A192387(n)/2.
 * @author Georg Fischer
 */
public class A192388 extends Sequence1 {

  final Sequence mA192387 = new A192387();
  @Override
  public Z next() {
    return mA192387.next().divide(Z.TWO);
  }

}
