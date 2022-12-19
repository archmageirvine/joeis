package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277597 a(n) = (1/2)*A277589(n).
 * @author Georg Fischer
 */
public class A277597 extends A277589 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
