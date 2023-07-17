package irvine.oeis.a134;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A134719 Odd Padovan numbers.
 * @author Georg Fischer
 */
public class A134719 extends A000931 {

  /** Construct the sequence. */
  public A134719() {
    super(1);
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (result.isEven()) {
      result = super.next();
    }
    return result;
  }
}
