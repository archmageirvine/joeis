package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A078734 Start with 1,2, concatenate 2^k previous terms and change last term as follows: 1-&gt;2, 2-&gt;3, 3-&gt;1.
 * a(n) = valuation(n, 2) % 3 + 1;
 * @author Georg Fischer
 */
public class A078734 extends Sequence1 {

  private Z mN;

  /** Construct the sequence. */
  public A078734() {
    mN = Z.ZERO;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(ZUtils.valuation(mN, Z.TWO) % 3 + 1);
  }
}
