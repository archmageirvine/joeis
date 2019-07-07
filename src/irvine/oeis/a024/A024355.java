package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a020.A020883;
import irvine.oeis.a020.A020884;

/**
 * A024355 Consider primitive Pythagorean triangles <code>(A^2 + B^2 = C^2, (A, B) = 1, A &lt;= B)</code>; sequence gives values of AUB, sorted.
 * @author Sean A. Irvine
 */
public class A024355 implements Sequence {

  // Not a strict union due to repeated elements
  private final Sequence mASeq = new A020883();
  private final Sequence mBSeq = new A020884();
  private Z mA = mASeq.next();
  private Z mB = mBSeq.next();

  @Override
  public Z next() {
    if (mA.compareTo(mB) <= 0) {
      final Z t = mA;
      mA = mASeq.next();
      return t;
    } else {
      final Z t = mB;
      mB = mBSeq.next();
      return t;
    }
  }
}
