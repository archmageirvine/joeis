package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070984 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR m = CR.valueOf(++mN);
    long k = 0;
    while (CR.valueOf(++k).log().multiply(k).compareTo(m) < 0) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
