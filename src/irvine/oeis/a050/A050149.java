package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050149 a(n) = T(n,n-3), array T as in A050143.
 * @author Sean A. Irvine
 */
public class A050149 extends A050143 {

  /** Construct the sequence. */
  public A050149() {
    super(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
