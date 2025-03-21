package irvine.oeis.a274;
// Generated by gen_seq4.pl 2025-03-09.ack/parmof2 at 2025-03-09 21:42

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.KimberlingTreeSequence;

/**
 * A274158 Number of integers in n-th generation of tree T(2^(-1/3)) defined in Comments.
 * @author Georg Fischer
 */
public class A274158 extends KimberlingTreeSequence<CR> {

  /** Construct the sequence. */
  public A274158() {
    super(0, ComputableReals.SINGLETON, CR.TWO.pow(new Q(-1, 3)));
  }
}
