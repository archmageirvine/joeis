package irvine.oeis.a156;
// manually partran at 2022-10-18 05:00

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002293;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A156064 Inverse of Riordan array (1/(1-x^4), x/(1-x^4)), A156062.
 * @author Georg Fischer
 */
public class A156064 extends PartitionTransformTriangle {

  private static class MySequence extends A002293 implements Sequence {

    private int mN = -1;

    public Z next() {
      ++mN;
      return (mN % 4 != 0) ? Z.ZERO : (((mN % 8) == 0) ? super.next() : super.next().negate());
    }
  }

  /** Construct the sequence. */
  public A156064() {
    super(0, new MySequence());
  }
}
