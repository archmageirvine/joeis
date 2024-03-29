package irvine.oeis.a062;
// Generated by gen_seq4.pl num1dig at 2021-04-28 10:09

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;


/**
 * A062756 Number of 1's in ternary (base-3) expansion of n.
 * @author Georg Fischer
 */
public class A062756 extends Sequence0 {

  protected int mN = -1;
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.digitCounts(Z.valueOf(mN), 3)[1]);
  }
}
