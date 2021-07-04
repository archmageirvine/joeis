package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048766 Integer part of cube root of n. Or, number of cubes &lt;= n. Or, n appears 3n^2 + 3n + 1 times.
 * @author Sean A. Irvine
 */
public class A048766 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.root(3);
  }
}
