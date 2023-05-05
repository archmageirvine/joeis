package irvine.oeis.a130;
// manually partsum at 2023-05-04 08:23

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a057.A057779;

/**
 * A130623 Number of polyhexes with perimeter at most 2n.
 * @author Georg Fischer
 */
public class A130623 extends PartialSumSequence {

  /** Construct the sequence. */
  public A130623() {
    super(1, new A057779());
  }
}
