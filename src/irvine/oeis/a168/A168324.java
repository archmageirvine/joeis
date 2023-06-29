package irvine.oeis.a168;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008480;

/**
 * A168324 Number of distinct permutations of the list of prime factors of n (with multiplicity), where a(1)=0.
 * @author Georg Fischer
 */
public class A168324 extends PrependSequence {

  /** Construct the sequence. */
  public A168324() {
    super(1, new A008480().skip(1), 0);
  }
}
