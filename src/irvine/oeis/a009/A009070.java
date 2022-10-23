package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A009070 Ordered sides of Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A009070 extends Sequence1 {

  private final Sequence mSeqA = new A009000();
  private final Sequence mSeqB = new A009041();
  private Z mNextA = mSeqA.next();
  private Z mNextB = mSeqB.next();

  @Override
  public Z next() {
    final Z t;
    if (mNextA.equals(mNextB)) {
      t = mNextA;
      mNextA = mSeqA.next();
    } else if (mNextA.compareTo(mNextB) < 0) {
      t = mNextA;
      mNextA = mSeqA.next();
    } else {
      t = mNextB;
      mNextB = mSeqB.next();
    }
    return t;
  }
}
