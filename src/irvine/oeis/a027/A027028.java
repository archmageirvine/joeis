package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027028 a(n) = T(n,2n-4), T given by A027023.
 * @author Sean A. Irvine
 */
public class A027028 extends A027023 {

  /** Construct the sequence. */
  public A027028() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 4);
  }
}
