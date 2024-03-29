package irvine.oeis.a158;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001221;
import irvine.oeis.a008.A008683;

/**
 * A158210 a(n) = omega(n) * (-1)^mu(n), where mu is the Moebius function.
 * @author Georg Fischer
 */
public class A158210 extends Sequence1 {

  final Sequence mA001221 = new A001221();
  final Sequence mA008683 = new A008683();
  @Override
  public Z next() {
    return mA001221.next().multiply(Z.NEG_ONE.pow(mA008683.next()));
  }

}
