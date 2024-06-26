package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A327138 Numbers k such that cos(2k) &lt; cos(2k+2).
 * @author Georg Fischer
 */
public class A327138 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A327138() {
    super(1, 1, k -> {
      final CR[] c2k = {CR.valueOf(2 * k).cos(), CR.valueOf(2 * k + 2).cos()};
      return c2k[0].compareTo(c2k[1]) < 0;
    });
  }
}
