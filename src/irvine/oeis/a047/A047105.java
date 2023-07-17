package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047105 T(n,n-3), array T as in A047100.
 * @author Sean A. Irvine
 */
public class A047105 extends A047100 {

  /** Construct the sequence. */
  public A047105() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
