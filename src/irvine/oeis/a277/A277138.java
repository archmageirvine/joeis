package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A277138 Numbers k such that cos(k) &lt; 0 and cos(k+2) &gt; 0.
 * @author Georg Fischer
 */
public class A277138 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A277138() {
    super(1, 1, k -> CR.valueOf(k).cos().compareTo(CR.ZERO) < 0 && CR.valueOf(k + 2).cos().compareTo(CR.ZERO) > 0);
  }
}
