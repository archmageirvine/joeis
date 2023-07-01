package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A064339 Row sums of unsigned triangle A064334.
 * @author Sean A. Irvine
 */
public class A064339 extends RowSumSequence {

  /** Construct the sequence. */
  public A064339() {
    super(0, new A064334() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    });
  }
}
