package irvine.oeis.a074;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A074205 Smallest positive integer whose n-th power contains an equal number of each digit (0-9) when represented in base 10.
 * @author Sean A. Irvine
 */
public class A074205 extends Sequence1 {

  private static final Z PAN = Z.valueOf(1023456789L);
  private int mN = 0;

  @Override
  public Z next() {
    Z k = PAN.root(++mN);
    while (true) {
      final Z t = k.pow(mN);
      if (IntegerUtils.isConstant(ZUtils.digitCounts(t))) {
        return k;
      }
      k = k.add(1);
    }
  }
}
