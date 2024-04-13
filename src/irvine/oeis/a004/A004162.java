package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000326;

/**
 * A004162 Sum of digits of pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A004162 extends A000326 {

  /** Construct the sequence. */
  public A004162() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
