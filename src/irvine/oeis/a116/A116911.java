package irvine.oeis.a116;
// manually partsum at 2023-06-30 09:12

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;

/**
 * A116911 Prime partial sums of pentagonal numbers with prime indices.
 * @author Georg Fischer
 */
public class A116911 extends PartialSumSequence {

  /** Construct the sequence. */
  public A116911() {
    super(1, new A116995());
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
