package irvine.oeis.a088;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006519;

/**
 * A088837 Numerator of sigma(2*n)/sigma(n). Denominator see in A038712.
 * @author Georg Fischer
 */
public class A088837 extends Sequence1 {

  final Sequence mA006519 = new A006519();
  @Override
  public Z next() {
    return Z.FOUR.multiply(mA006519.next()).subtract(Z.ONE);
  }

}
