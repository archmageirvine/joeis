package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A327136 Numbers k such that sin(2k) &gt; sin(2k+2) &lt; sin(2k+4).
 * @author Georg Fischer
 */
public class A327136 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A327136() {
    super(1, 1, k -> {
      final CR[] c2k = {CR.valueOf(2 * k).sin(), CR.valueOf(2 * k + 2).sin(), CR.valueOf(2 * k + 4).sin()};
      return c2k[0].compareTo(c2k[1]) > 0 && c2k[1].compareTo(c2k[2]) < 0;
    });
  }
}
