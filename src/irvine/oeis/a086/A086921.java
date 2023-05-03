package irvine.oeis.a086;
// manually n2/n2sub1 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a061.A061799;

/**
 * A086921 Least number with at least n divisors that are at most its square root.
 * @author Georg Fischer
 */
public class A086921 extends A061799 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
