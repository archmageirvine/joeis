package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007087 Next term is uniquely the sum of 3 earlier terms.
 * @author Sean A. Irvine
 */
public class A007087 extends A007086 {

  @Override
  protected Z a3() {
    return Z.FOUR;
  }
}
