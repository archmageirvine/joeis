package irvine.oeis.a357;

import irvine.math.z.Z;

/**
 * A357288 a(n) = (1/4)*A357287(n).
 * @author Georg Fischer
 */
public class A357288 extends A357287 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
