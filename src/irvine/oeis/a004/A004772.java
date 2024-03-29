package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004772 Numbers that are not congruent to 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A004772 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 3) == 1);
    return Z.valueOf(mN);
  }
}

