package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025183 a(n) = T(2n-1,n), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025183 extends A025177 {

  /** Construct the sequence. */
  public A025183() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}
