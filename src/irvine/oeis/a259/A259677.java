package irvine.oeis.a259;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000567;

/**
 * A259677 Octagonal numbers (A000567) that are semiprimes (A001358).
 * @author Georg Fischer
 */
public class A259677 extends FilterSequence {

  /** Construct the sequence. */
  public A259677() {
    super(1, new A000567(), Predicates.SEMIPRIME::is);
  }
}
