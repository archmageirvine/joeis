package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a051.A051402;

/**
 * A084235 Smallest k such that |M(k)| = 2^n, where M(x) is Mertens's function A002321.
 * @author Sean A. Irvine
 */
public class A084235 extends Sequence0 {

  private final Sequence mS = new A051402();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    final long s = 1L << ++mN;
    while (mM + 1 < s) {
      ++mM;
      mS.next();
    }
    ++mM;
    return mS.next();
  }
}
