package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394760 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A394760 extends Sequence1 {

  private Z mA = null;
  private Z mSum = Z.THREE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mA.isOne()) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final Z rad = Functions.RAD.z(mSum);
    Z t = rad;
    while (t.compareTo(mA) <= 0 || !Functions.RAD.z(t).equals(rad)) {
      t = t.add(rad);
    }
    mSum = mSum.add(t);
    mA = t;
    return t;
  }
}
