package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004777 Numbers not congruent to 7 mod 8.
 * @author Sean A. Irvine
 */
public class A004777 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 7) == 7);
    return Z.valueOf(mN);
  }
}

