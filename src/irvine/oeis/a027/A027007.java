package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027007 a(n) = A026998(2n+1, n+4).
 * @author Sean A. Irvine
 */
public class A027007 extends A027960 {

  /** Construct the sequence. */
  public A027007() {
    super(3);
  }

  private long mN = 5;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, mN + 7);
  }
}
