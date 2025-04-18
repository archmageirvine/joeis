package irvine.oeis.a061;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a021.A021559;

/**
 * A061105 Smallest number whose sum of digits is n^3.
 * @author Georg Fischer
 */
public class A061105 extends Sequence0 {

  final Sequence mA021559 = new A021559();
  final Sequence mA061263 = new A061263();
  /** Construct the sequence. */
  public A061105() {
    mA021559.next();
  }
  
  @Override
  public Z next() {
    return mA021559.next().add(Z.ONE).multiply(Z.TEN.pow(mA061263.next())).subtract(Z.ONE);
  }

}
