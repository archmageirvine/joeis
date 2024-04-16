package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033860 Sort-then-add sequence: a(n+1) = a(n) + sort(a(n)).
 * @author Sean A. Irvine
 */
public class A033860 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_SORT_ASCENDING.z(mA));
    return mA;
  }
}
