package irvine.oeis.a246;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a213.A213624;

/**
 * A246833 Expansion of psi(-x)^2 * psi(x^4) in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A246833 implements Sequence {

  final Sequence mA213624 = new A213624();
  protected long mN;
  /** Construct the sequence. */
  public A246833() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return ((mN & 1L) == 0 ? Z.ONE : Z.NEG_ONE).multiply(mA213624.next());
  }

}
