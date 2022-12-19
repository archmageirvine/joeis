package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277601 (1/2)*A277595.
 * @author Georg Fischer
 */
public class A277601 extends A277595 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
