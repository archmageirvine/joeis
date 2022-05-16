package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055153 Numbers n such that sigma(n) = 7n/2.
 * @author Georg Fischer
 */
public class A055153 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A055153() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (!Jaguar.factor(mN).sigma().equals(Z.SEVEN.multiply(mN).divide2())) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
