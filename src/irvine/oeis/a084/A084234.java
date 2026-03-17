package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051402;

/**
 * A084234 Smallest k such that |M(k)| = n^2, where M(x) is Mertens's function A002321.
 * @author Sean A. Irvine
 */
public class A084234 extends Sequence1 {

  private final Sequence mS = new A051402();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    while (mM + 1 < s) {
      ++mM;
      mS.next();
    }
    ++mM;
    return mS.next();
  }
}
