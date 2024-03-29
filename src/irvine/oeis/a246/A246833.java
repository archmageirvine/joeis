package irvine.oeis.a246;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a213.A213624;

/**
 * A246833 Expansion of psi(-x)^2 * psi(x^4) in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A246833 extends Sequence0 {

  final Sequence mA213624 = new A213624();
  protected long mN;
  /** Construct the sequence. */
  public A246833() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.NEG_ONE.pow(mN).multiply(mA213624.next());
  }

}
