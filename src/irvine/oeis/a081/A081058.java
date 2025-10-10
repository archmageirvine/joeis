package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035485;

/**
 * A081058 Number of shuffles in Guy's shuffle (see A035485) for the card that is at the top of the deck after n shuffles to come to the top again.
 * @author Sean A. Irvine
 */
public class A081058 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A035485().skip(mN);
    final Z top = s.next();
    long cnt = 0;
    do {
      ++cnt;
    } while (!s.next().equals(top));
    return Z.valueOf(cnt);
  }
}
