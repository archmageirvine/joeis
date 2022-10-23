package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A100196 Numbers of positive integer cubes &lt;= n^2.
 * @author Sean A. Irvine
 */
public class A100196 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().root(3);
  }
}
