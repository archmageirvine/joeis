package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005427 Josephus problem: numbers m such that, when m people are arranged on a circle and numbered 1 through m, the final survivor when we remove every 4th person is one of the first three people.
 * @author Sean A. Irvine
 */
public class A005427 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z t = Z.FIVE.add(mSum.add(2).divide(3));
    mSum = mSum.add(t);
    return t;
  }
}
