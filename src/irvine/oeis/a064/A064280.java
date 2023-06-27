package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000166;
import irvine.oeis.a007.A007016;
import irvine.oeis.a037.A037224;
import irvine.oeis.a053.A053871;

/**
 * A064280 Number of nonequivalent solutions to the order n checkerboard problem up to reflection and rotation: place n pieces on an n X n board so there is exactly one piece in each row, column and main diagonal.
 * @author Sean A. Irvine
 */
public class A064280 extends Sequence1 {

  // after Andrew Howroyd

  private int mN = 0;
  private final Sequence mF = new A007016().skip();
  private final Sequence mSF = new A000166();
  private final Sequence mR = new PrependSequence(new A037224(), 0);
  private final Sequence mD = new A053871();

  @Override
  public Z next() {
    final Z f = mF.next();
    if ((++mN & 1) == 0) {
      return f.divide(8);
    }
    final int m = mN / 2;
    mR.next(); // skip odd terms
    return f.add(mSF.next().shiftLeft(m).add(mR.next().multiply2()).add(mD.next().multiply2()).add(m == 0 ? 2 : 0)).divide(8);
  }
}
