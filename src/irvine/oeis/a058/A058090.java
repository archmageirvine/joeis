package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058090 a(n) = A058087(n,n-7).
 * @author Sean A. Irvine
 */
public class A058090 extends A058087 {

  /** Construct the sequence. */
  public A058090() {
    super(7);
  }

  private int mN = 6;

  @Override
  public Z next() {
    return t(++mN, mN - 7);
  }
}

