package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A100196 Numbers of positive integer cubes <code>&lt;= n^2</code>.
 * @author Sean A. Irvine
 */
public class A100196 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().root(3);
  }
}
