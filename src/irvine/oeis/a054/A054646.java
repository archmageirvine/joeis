package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010120;

/**
 * A054646 Smallest number to give 2^(2n) in a hailstone (or 3x + 1) sequence.
 * @author Sean A. Irvine
 */
public class A054646 extends PrependSequence {

  /** Construct the sequence. */
  public A054646() {
    super(1, new A010120() {
      @Override
      public Z next() {
        super.next();
        return super.next();
      }
    }.skip(1), 1);
  }

}
