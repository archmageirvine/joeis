package irvine.oeis.a140;
// manually A204892/parm4 at 2022-05-02 10:35

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a204.A204892;

/**
 * A140670 a(n) = 1 if n is odd; otherwise, a(n) = 2^k - 1 where 2^k is the largest power of 2 that divides n.
 * @author Georg Fischer
 */
public class A140670 extends A204892 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.ONE : Z.ONE.shiftLeft(LongUtils.valuation(mN, 2)).subtract(1);
  }
}
