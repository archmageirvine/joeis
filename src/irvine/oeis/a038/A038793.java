package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038793 T(n,n-3), array T as in A038792.
 * @author Sean A. Irvine
 */
public class A038793 extends A038792 {

  /** Construct the sequence. */
  public A038793() {
    super(3);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 4L);
  }
}
