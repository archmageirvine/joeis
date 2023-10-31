package irvine.oeis.a066;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a124.A124868;
import irvine.oeis.a166.A166081;

/**
 * A066615 Numbers that are not the sum of two or three distinct primes.
 * @author Sean A. Irvine
 */
public class A066615 extends IntersectionSequence {

  /** Construct the sequence. */
  public A066615() {
    super(1, new A166081(), new A124868());
  }
}
