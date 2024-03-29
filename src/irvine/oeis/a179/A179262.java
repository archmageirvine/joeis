package irvine.oeis.a179;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A179262 a(n) = 2*prime(n)^2 - 1.
 * @author Georg Fischer
 */
public class A179262 extends Sequence1 {

  final Sequence mA000040 = new A000040();
  @Override
  public Z next() {
    return Z.TWO.multiply(mA000040.next().square()).subtract(Z.ONE);
  }

}
