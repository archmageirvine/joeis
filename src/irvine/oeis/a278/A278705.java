package irvine.oeis.a278;
// manually simbinom at 2023-03-15 10:09

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A278705 Number of length-4 cycles in all simple labeled graphs on n nodes.
 * <code>seq(n*(n-1)*(n-2)*(n-3)/8*2^(binomial(n, 2)-4),n=4..20);</code>
 * @author Georg Fischer
 */
public class A278705 extends AbstractSequence {

  private int mN = 3;

  /** Construct the sequence. */
  public A278705() {
    super(4);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(Binomial.binomial(mN, 2).longValue() - 4)
      .multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3).divide(8);
  }
}
