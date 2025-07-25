package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055153 Numbers k such that sigma(k) = 7k/2.
 * @author Georg Fischer
 */
public class A055153 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A055153() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (!Functions.SIGMA1.z(mN).equals(Z.SEVEN.multiply(mN).divide2())) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
