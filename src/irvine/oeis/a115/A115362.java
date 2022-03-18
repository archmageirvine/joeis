package irvine.oeis.a115;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A115362 Row sums of ((1,x) + (x,x^2))^(-1)*((1,x)-(x,x^2))^(-1) (using Riordan array notation).
 * a(n) is 1 + the 4-adic valuation of n+1.
 * @author Georg Fischer
 */
public class A115362 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A115362() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(1 + ZUtils.valuation(Z.FOUR, Z.valueOf(mN + 1)));
  }
}
