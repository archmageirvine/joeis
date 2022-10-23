package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A009041 Ordered legs of Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A009041 extends Sequence1 {

  private final Sequence mSeqA = new A009004();
  private final Sequence mSeqB = new A009012();
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
