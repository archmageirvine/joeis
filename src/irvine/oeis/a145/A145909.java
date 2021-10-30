package irvine.oeis.a145;
// manually at 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061039;

/**
 * A145909 First 6-fold decimation of A061039. First bisection of A144454.
 * @author Georg Fischer
 */
public class A145909 extends A061039 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
