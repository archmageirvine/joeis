package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055454 a(n) = A055450(n, n-4).
 * @author Sean A. Irvine
 */
public class A055454 extends A055450 {

  /** Construct the sequence. */
  public A055454() {
    super(4);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN + 4, mN);
  }
}
