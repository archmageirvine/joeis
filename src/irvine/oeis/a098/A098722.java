package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A098722 a(n) = C(n, 3)^(n-4).
 * @author Georg Fischer
 */
public class A098722 extends AbstractSequence {

  private long mN = 2;

  /** Construct the sequence. */
  public A098722() {
    super(3);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN - 1).multiply(mN - 2).divide(6).pow(mN - 4);
  }
}
