package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277598 (1/2)*A277591.
 * @author Georg Fischer
 */
public class A277598 extends A277591 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
