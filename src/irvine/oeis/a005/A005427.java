package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005427 Josephus problem.
 * @author Sean A. Irvine
 */
public class A005427 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z t = Z.FIVE.add(mSum.add(2).divide(3));
    mSum = mSum.add(t);
    return t;
  }
}
