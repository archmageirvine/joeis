package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004776 Numbers not congruent to 5 (mod 8).
 * @author Sean A. Irvine
 */
public class A004776 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 7) == 5);
    return Z.valueOf(mN);
  }
}

