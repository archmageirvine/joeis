package irvine.oeis.a062;
// Generated by gen_seq4.pl A062450/simple at 2022-06-14 21:28

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062464 Nearest integer to log(n)^sqrt(n).
 * @author Georg Fischer
 */
public class A062464 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ZERO : CR.valueOf(mN).log().pow(CR.valueOf(mN).sqrt()).round();
  }
}
