package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.a082.A082909;

/**
 * A093061 6 * Sum_{d|n} (d mod 3).
 * @author Georg Fischer
 */
public class A093061 extends A082909 {

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
