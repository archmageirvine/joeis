package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033860 Sort-then-add sequence: a(n+1) = a(n) + sort(a(n)).
 * @author Sean A. Irvine
 */
public class A033860 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
