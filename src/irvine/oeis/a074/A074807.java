package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064353.
 * @author Sean A. Irvine
 */
public class A074807 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NEG_ONE; // alternates 0, 1
    }
    Z t = Z.valueOf(mN);
    long cnt = 0;
    do {
      t = t.multiply2().signedAdd(t.isEven(), Functions.DIGIT_PRODUCT.z(t).add(1));
      ++cnt;
    } while (!t.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
