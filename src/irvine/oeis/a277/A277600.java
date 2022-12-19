package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277600 (1/2)*A277593.
 * @author Georg Fischer
 */
public class A277600 extends A277593 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
