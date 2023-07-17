package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047088 a(n) = A047080(2*n+1, n+2).
 * @author Sean A. Irvine
 */
public class A047088 extends A047080 {

  /** Construct the sequence. */
  public A047088() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
