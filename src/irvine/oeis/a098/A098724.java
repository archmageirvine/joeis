package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A098724 a(n) = C(n, 5)^(n-6).
 * @author Georg Fischer
 */
public class A098724 extends AbstractSequence {

  private long mN = 4;

  /** Construct the sequence. */
  public A098724() {
    super(5);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3).multiply(mN - 4).divide(120).pow(mN - 6);
  }
}
