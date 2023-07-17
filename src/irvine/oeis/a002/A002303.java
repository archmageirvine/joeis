package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002303 Generalized tangent numbers.
 * @author Sean A. Irvine
 */
public class A002303 extends A002302 {

  /** Construct the sequence. */
  public A002303() {
    super(4);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return get(mN + 6, mN);
  }
}
