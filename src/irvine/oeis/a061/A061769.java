package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a011.A011778;

/**
 * A061769 The least number <code>k = a(n) &gt; a(n-1)</code> for which k!/(k+1)^m for increasing m's.
 * @author Sean A. Irvine
 */
public class A061769 extends A011778 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
