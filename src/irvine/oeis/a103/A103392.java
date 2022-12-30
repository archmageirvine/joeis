package irvine.oeis.a103;
// manually 2022-12-25

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001358;

/**
 * A103392 Semiprimes in A103372.
 * @author Georg Fischer
 */
public class A103392 extends IntersectionSequence {

  /** Construct the sequence. */
  public A103392() {
    super(new A103372(), new A001358());
  }
}
