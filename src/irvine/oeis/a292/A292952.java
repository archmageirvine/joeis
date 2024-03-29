package irvine.oeis.a292;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003725;

/**
 * A292952 E.g.f.: exp(-x * exp(x)).
 * @author Georg Fischer
 */
public class A292952 extends Sequence0 {

  final Sequence mA003725 = new A003725();
  protected long mN;
  /** Construct the sequence. */
  public A292952() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.NEG_ONE.pow(mN).multiply(mA003725.next());
  }

}
