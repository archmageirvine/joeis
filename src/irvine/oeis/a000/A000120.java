package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000120 1's-counting sequence: number of 1's in binary expansion of n (or the binary weight of n).
 * @author Sean A. Irvine
 */
public class A000120 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(mN.bitCount());
  }
}

