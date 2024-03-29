package irvine.oeis.a328;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000670;

/**
 * A328183 Expansion of e.g.f. 1 / (2 - exp(4*x)).
 * @author Georg Fischer
 */
public class A328183 extends Sequence0 {

  final Sequence mA000670 = new A000670();
  protected long mN;
  /** Construct the sequence. */
  public A328183() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.FOUR.pow(Z.valueOf(mN)).multiply(mA000670.next());
  }

}
