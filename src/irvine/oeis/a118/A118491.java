package irvine.oeis.a118;
// manually partprom/partprod at 2022-04-12 12:36

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a109.A109611;

/**
 * A118491 Product of first n Chen primes.
 * @author Georg Fischer
 */
public class A118491 extends PrependSequence {

  /** Construct the sequence. */
  public A118491() {
    super(new PartialProductSequence(new A109611()), 1);
  }
}
