package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083464 Triangle read by rows in which row n contains the n smallest palindromes == 1 mod n and &gt; 1.
 * @author Sean A. Irvine
 */
public class A083464 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private Sequence mPalin = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.TWO; // avoid need for 1 % mN later
      }
      mM = 0;
      mPalin = new A002113().skip(2);
    }
    while (true) {
      final Z p = mPalin.next();
      if (p.mod(mN) == 1) {
        return p;
      }
    }
  }
}
