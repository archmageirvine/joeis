package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084695 Triangle read by rows in which row n lists the n smallest positive numbers k such that k + n is a prime.
 * @author Sean A. Irvine
 */
public class A084695 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mP = mN;
    }
    mP = Functions.NEXT_PRIME.l(mP);
    return Z.valueOf(mP - mN);
  }
}
