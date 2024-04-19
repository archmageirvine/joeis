package irvine.oeis.a072;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A072529 Product of the next n multiples of n.
 * @author Georg Fischer
 */
public class A072529 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A072529() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    // a(n) = n^n * [n(n+1)/2]! / [n(n-1)/2]!
    ++mN;
    return Z.valueOf(mN).pow(mN)
      .multiply(Functions.FACTORIAL.z(mN * (mN + 1) / 2))
      .divide(Functions.FACTORIAL.z(mN * (mN - 1) / 2));
  }
}
