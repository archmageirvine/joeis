package irvine.oeis.a161;
// Generated by gen_seq4.pl 2023-12-08/filtpos at 2023-12-08 18:44

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001006;

/**
 * A161674 Positions n such that A010060(n) + A010060(n+2) = 1.
 * @author Georg Fischer
 */
public class A161674 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A161674() {
    super(1, 0, new A001006(), ODD);
  }
}
