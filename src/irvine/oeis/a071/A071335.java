package irvine.oeis.a071;

import irvine.oeis.Combiner;
import irvine.oeis.a010.A010051;
import irvine.oeis.a061.A061358;
import irvine.oeis.a068.A068307;

/**
 * A071335 Number of partitions of n into sum of at most three primes.
 * @author Sean A. Irvine
 */
public class A071335 extends Combiner {

  /** Construct the sequence. */
  public A071335() {
    super(1, new Combiner(1, new A010051(), new A061358().skip(), ADD), new A068307(), ADD);
  }
}
