package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-01-23/filnum at 2024-01-25 00:21

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A364659 Numbers k such that sigma(k) &lt; sigma(k+1) &lt; sigma(k+2).
 * @author Georg Fischer
 */
public class A364659 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A364659() {
    super(1, 0, k -> Functions.SIGMA1.z(k).compareTo(Functions.SIGMA1.z(k + 1)) < 0 && Functions.SIGMA1.z(k + 1).compareTo(Functions.SIGMA1.z(k + 2)) < 0);
  }
}
