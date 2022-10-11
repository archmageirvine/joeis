package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a033.A033877;
import irvine.oeis.triangle.Transpose;

/**
 * A080245 Inverse of coordination sequence array A113413.
 * @author Georg Fischer
 */
public class A080245 extends Transpose implements SequenceWithOffset {

  /** Construct the sequence. */
  public A080245() {
    super(new A033877());
  }

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return ((mRow + mCol - 1) & 1) == 0 ? result : result.negate();
  }
}
