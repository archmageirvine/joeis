package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A000069 Odious numbers: numbers with an odd number of 1's in their binary expansion.
 * @author Sean A. Irvine
 */
public class A000069 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Long.bitCount(++mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }

  @Override
  public Z a(final Z n) {
    // a(n+1) = (1/2) * (4*n + 1 + (-1)^A000120(n))
    return n.multiply(4).subtract(3).add(((n.subtract(1).bitCount() & 1) == 1) ? Z.ONE : Z.NEG_ONE).divide(2);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf((n * 4 - 3 + ((Integer.bitCount(n - 1) & 1) == 0 ? 1 : -1)) / 2);
  }

}

