package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060984 a(1) = 1; a(n+1) = a(n) + (largest square &lt;= a(n)).
 * @author Sean A. Irvine
 */
public class A060984 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.sqrt().square());
    return mA;
  }
}
