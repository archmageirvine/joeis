package irvine.oeis.a339;
// manually valuation/valuat at 2022-03-16 13:50

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A339814 The exponent of the highest power of 2 dividing (A019565(2n) - 1).
 * @author Georg Fischer
 */
public class A339814 extends A339809 {

  /** Construct the sequence. */
  public A339814() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(ZUtils.valuation(Z.TWO, super.next()));
    super.next();
    return result;
  }
}
