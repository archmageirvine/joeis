package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A070751 Numbers n such that sin(n) &lt; 0.
 * @author Georg Fischer
 */
public class A070751 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A070751() {
    super(1, 1, k -> CR.valueOf(k).sin().compareTo(CR.ZERO) < 0);
  }
}
