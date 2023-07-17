package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027150 a(n) = A027144(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A027150 extends A027144 {

  /** Construct the sequence. */
  public A027150() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
