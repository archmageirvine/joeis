package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009056 Numbers <code>&gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A009056 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN;
  }
}
