package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277572 (1/2)*A277568.
 * @author Georg Fischer
 */
public class A277572 extends A277568 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
