package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-02/filnum at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A374180 Numbers k such that K(3 / k) != K((-1)^floor(k/2)*k / 3), where K(a/b) is the Kronecker symbol. Row 1 of A374188.
 * @author Georg Fischer
 */
public class A374180 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A374180() {
    super(1, 1, k -> Functions.KRONECKER.i(3, k) != Functions.KRONECKER.i((((k / 2) & 1) == 0) ? k : -k, 3));
  }
}
