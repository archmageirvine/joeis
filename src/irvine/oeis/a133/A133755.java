package irvine.oeis.a133;
// manually A060164/summu1 at 2022-03-25 11:39

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A133755 Number of positive integers less than n/3 that are coprime to n.
 * @author Georg Fischer
 */
public class A133755 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 3) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(Mobius.mobius(mN / d) * d / 3));
  }
}
