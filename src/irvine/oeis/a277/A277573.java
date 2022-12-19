package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277573 a(n) = (1/3)*A277569(n).
 * @author Georg Fischer
 */
public class A277573 extends A277569 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
