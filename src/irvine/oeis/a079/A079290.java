package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073078;

/**
 * A079290 Composite numbers satisfying A073078(n)=(n+1)/2.
 * @author Sean A. Irvine
 */
public class A079290 extends Sequence1 {

  private final Sequence mS = new A073078().skip();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mS.next().multiply2().longValue() == mN + 1) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
