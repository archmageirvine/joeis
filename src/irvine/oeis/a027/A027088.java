package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027088 a(n) = A027082(n, 2n-1).
 * @author Sean A. Irvine
 */
public class A027088 extends A027082 {

  /** Construct the sequence. */
  public A027088() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 1);
  }
}
