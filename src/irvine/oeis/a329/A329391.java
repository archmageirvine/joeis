package irvine.oeis.a329;

import irvine.math.z.Z;

/**
 * A329391 a(n) = (1/2)*A329390(n).
 * @author Georg Fischer
 */
public class A329391 extends A329390 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
