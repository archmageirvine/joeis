package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018221 Row 2 of <code>A018219</code>, i.e., <code>(2,n,a_n)</code> is a winning position.
 * @author Sean A. Irvine
 */
public class A018221 extends A018219 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 2L));
  }
}

