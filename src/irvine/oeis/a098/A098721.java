package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A098721 a(n) = C(n, 2)^(n-3) = (n(n-1)/2)^(n-3).
 * @author Georg Fischer
 */
public class A098721 extends AbstractSequence {

  private long mN = 1;

  /** Construct the sequence. */
  public A098721() {
    super(2);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN - 1).divide(2).pow(mN - 3);
  }
}
