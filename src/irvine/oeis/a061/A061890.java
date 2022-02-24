package irvine.oeis.a061;
// manually insect/insect2 at 2022-02-23 08:35

import irvine.oeis.IntersectionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a007.A007504;

/**
 * A061890 Squares that are the sum of initial primes.
 * @author Georg Fischer
 */
public class A061890 extends IntersectionSequence {

  /** Construct the sequence. */
  public A061890() {
    super(new SkipSequence(new A000290(), 1), new SkipSequence(new A007504(), 1));
  }
}
