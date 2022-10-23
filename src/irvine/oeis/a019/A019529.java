package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019529 Sum of a(n) terms of 1/sqrt(k) first strictly exceeds n.
 * @author Sean A. Irvine
 */
public class A019529 extends Sequence0 {

  private long mN = -1;
  private long mK = 2;
  private CR mSum = CR.ONE.add(CR.TWO.sqrt().inverse());

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN + 1); // Avoid cases of integers
    }
    final CR n = CR.valueOf(mN);
    while (mSum.compareTo(n) < 0) {
      mSum = mSum.add(CR.valueOf(++mK).sqrt().inverse());
    }
    return Z.valueOf(mK);
  }
}

