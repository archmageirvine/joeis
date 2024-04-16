package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033894 Sort then Add!.
 * @author Sean A. Irvine
 */
public class A033894 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.add(Functions.DIGIT_SORT_ASCENDING.z(mA));
    return mA;
  }
}
