package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055455 a(n) = A055450(n, n-5).
 * @author Sean A. Irvine
 */
public class A055455 extends A055450 {

  /** Construct the sequence. */
  public A055455() {
    super(5);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN + 5, mN);
  }
}
