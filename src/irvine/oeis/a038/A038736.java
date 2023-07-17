package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038736 T(3*n + 1, n + 1), array T as in A038792.
 * @author Sean A. Irvine
 */
public class A038736 extends A038792 {

  /** Construct the sequence. */
  public A038736() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN + 1, mN + 1);
  }
}
