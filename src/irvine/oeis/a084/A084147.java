package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A084147 Integers that have exactly 2 representations as sums of consecutive primes.
 * @author Sean A. Irvine
 */
public class A084147 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084147() {
    super(1, new A084143(), Z.TWO::equals);
  }
}
