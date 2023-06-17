package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014635 a(n) = 2*n*(4*n - 1).
 * @author Sean A. Irvine
 */
public class A014635 extends AbstractSequence {

  /** Construct the sequence. */
  public A014635() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(4 * mN - 1).multiply2();
  }
}
