package irvine.oeis.a176;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a158.A158611;

/**
 * A176098 a(n) = prime(n) times the n-th nonnegative noncomposite.
 * @author Georg Fischer
 */
public class A176098 extends Sequence1 {

  final Sequence mA000040 = new A000040();
  final Sequence mA158611 = new A158611();
  @Override
  public Z next() {
    return mA000040.next().multiply(mA158611.next());
  }

}
