package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036555 Hamming weight of 3n: number of 1's in binary expansion of 3n.
 * @author Sean A. Irvine
 */
public class A036555 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 3;
    return Z.valueOf(Long.bitCount(mN));
  }
}
