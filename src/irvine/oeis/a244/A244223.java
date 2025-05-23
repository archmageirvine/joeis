package irvine.oeis.a244;
// Generated by gen_seq4.pl 2025-05-02.ack/filtpos at 2025-05-02 12:03

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a014.A014418;

/**
 * A244223 Numbers k which have an odd representation in Greedy Catalan Base, i.e., where A014418(k) ends with digit one.
 * @author Georg Fischer
 */
public class A244223 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A244223() {
    super(1, 0, new A014418(), (k, v) -> v.mod(10) == 1);
  }
}
