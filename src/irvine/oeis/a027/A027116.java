package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027116 a(n) = A027113(n, n+3).
 * @author Sean A. Irvine
 */
public class A027116 extends A027113 {

  private long mN = 2;

  /** Construct the sequence. */
  public A027116() {
    super(3);
  }

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
