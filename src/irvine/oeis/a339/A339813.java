package irvine.oeis.a339;
// manually valuation/valuat at 2022-03-16 13:50

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A339813 The exponent of the highest power of 2 dividing (A019565(n) - 1).
 * @author Georg Fischer
 */
public class A339813 extends A339809 {

  /** Construct the sequence. */
  public A339813() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.TWO);
  }
}
