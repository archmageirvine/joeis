package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004773 Numbers congruent to {0, 1, 2} mod 4: a(n) = floor(4*n/3).
 * @author Sean A. Irvine
 */
public class A004773 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 3) == 3);
    return Z.valueOf(mN);
  }
}

