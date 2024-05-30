package irvine.oeis.a339;
// manually valuation/valuat at 2022-03-16 13:50

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A339814 The exponent of the highest power of 2 dividing (A019565(2n) - 1).
 * @author Georg Fischer
 */
public class A339814 extends A339809 {

  /** Construct the sequence. */
  public A339814() {
    super(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z result = Functions.VALUATION.z(super.next(), Z.TWO);
    super.next();
    return result;
  }
}
