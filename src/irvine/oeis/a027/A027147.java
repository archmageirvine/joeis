package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027147 a(n) = A027144(2n, n-2).
 * @author Sean A. Irvine
 */
public class A027147 extends A027144 {

  /** Construct the sequence. */
  public A027147() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
