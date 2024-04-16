package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068505 Decimal representation of n interpreted in base b+1, where b=A054055(n) is the largest digit in decimal representation of n.
 * @author Sean A. Irvine
 */
public class A068505 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final int base = (int) Functions.DIGIT_SORT_ASCENDING.z(n).mod(10) + 1;
    return new Z(Long.toString(mN), base);
  }
}

