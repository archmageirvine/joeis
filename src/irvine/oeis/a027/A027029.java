package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027029 a(n) = T(n,2n-5), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027029 extends A027023 {

  /** Construct the sequence. */
  public A027029() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 5);
  }
}
