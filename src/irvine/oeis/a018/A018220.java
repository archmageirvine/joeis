package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018220 Row 1 of <code>A018219</code>, i.e., <code>(1</code>, n, <code>a_n)</code> is a winning position.
 * @author Sean A. Irvine
 */
public class A018220 extends A018219 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 1L));
  }
}

