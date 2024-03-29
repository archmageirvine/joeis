package irvine.oeis.a214;
// Generated by gen_seq4.pl valuation/valuat at 2022-03-17 22:13

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a016.A016090;

/**
 * A214881 2-adic valuation of A016090.
 * @author Georg Fischer
 */
public class A214881 extends A016090 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(super.next(), Z.TWO));
  }
}
