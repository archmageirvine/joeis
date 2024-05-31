package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000629 Number of necklaces of partitions of n+1 labeled beads.
 * @author Sean A. Irvine
 */
public class A000629 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Functions.STIRLING2.z(mN, k).multiply(Functions.FACTORIAL.z(k)).shiftLeft(k);
      r = r.signedAdd(((mN - k) & 1) == 0, t);
    }
    return r;
  }
}

