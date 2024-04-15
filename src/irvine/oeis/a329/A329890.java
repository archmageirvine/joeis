package irvine.oeis.a329;
// manually simbinom/simjagfa at 2023-03-17 19:21

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A329890 a(1) = 1; for n &gt; 1, a(n) = sigma((2^n)-1) - sigma((2^(n-1))-1), where sigma is A000203, the sum of divisors.
 * @author Georg Fischer
 */
public class A329890 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A329890() {
    super(1);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : Functions.SIGMA.z(Z.ONE.shiftLeft(mN).subtract(1)).subtract(Functions.SIGMA.z(Z.ONE.shiftLeft(mN - 1).subtract(1)));
  }
}
