package irvine.oeis.a002;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002321 Mertens's function: Sum_{k=1..n} mu(k), where mu is the Moebius function A008683.
 * @author Sean A. Irvine
 */
public class A002321 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.mertens(++mN));
  }
}
