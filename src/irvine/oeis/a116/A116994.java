package irvine.oeis.a116;
// manually partsum at 2023-06-30 09:12

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a034.A034953;

/**
 * A116994 Prime partial sums of triangular numbers with prime indices.
 * @author Georg Fischer
 */
public class A116994 extends PartialSumSequence {

  /** Construct the sequence. */
  public A116994() {
    super(1, new A034953());
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
