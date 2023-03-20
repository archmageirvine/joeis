package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A098723 a(n) = C(n, 4)^(n-5).
 * @author Georg Fischer
 */
public class A098723 extends AbstractSequence {

  private long mN = 3;

  /** Construct the sequence. */
  public A098723() {
    super(4);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3).divide(24).pow(mN - 5);
  }
}
