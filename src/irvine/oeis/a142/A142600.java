package irvine.oeis.a142;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061037;

/**
 * A142600 Third trisection of A061037.
 * @author Georg Fischer
 */
public class A142600 extends A061037 {

  /** Construct the sequence. */
  public A142600() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
