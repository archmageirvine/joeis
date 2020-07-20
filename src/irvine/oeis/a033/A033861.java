package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033861 <code>Sort-then-add</code> sequence: <code>a(1) = 316, a(n+1) = a(n) + sort(a(n))</code>.
 * @author Sean A. Irvine
 */
public class A033861 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(316) : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
