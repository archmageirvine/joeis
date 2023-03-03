package irvine.oeis.a353;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a061.A061339;

/**
 * A353058 Minimum number of iterations {add or subtract 1, or half if even} needed to reach 1, starting from n.
 * @author Georg Fischer
 */
public class A353058 extends A061339 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
