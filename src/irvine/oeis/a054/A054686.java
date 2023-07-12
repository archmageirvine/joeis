package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a000.A000290;

/**
 * A054686 Multiset consisting of squares and triangular numbers.
 * @author Sean A. Irvine
 */
public class A054686 extends A000217 {

  /** Construct the sequence. */
  public A054686() {
    super(1);
  }

  private final Sequence mA = new A000290();
  private Z mTriangle = super.next();
  private Z mSquare = mA.next();

  @Override
  public Z next() {
    final Z res;
    if (mTriangle.compareTo(mSquare) <= 0) {
      res = mTriangle;
      mTriangle = super.next();
    } else {
      res = mSquare;
      mSquare = mA.next();
    }
    return res;
  }
}
