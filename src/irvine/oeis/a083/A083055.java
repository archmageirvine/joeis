package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A083055 a(n) = cardinality{ k&lt;=n / A083054(k)=1}.
 * @author Sean A. Irvine
 */
public class A083055 extends Sequence1 {

  private final Sequence mA = new A083054();
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (mA.next().isOne()) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

