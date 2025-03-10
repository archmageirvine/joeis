package irvine.oeis.a274;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.KimberlingTreeSequence;

/**
 * A274156 Number of integers in n-th generation of tree T(2^(-1/2)) defined in Comments.
 * @author Georg Fischer
 */
public class A274156 extends KimberlingTreeSequence<CR> {

  /** Construct the sequence. */
  public A274156() {
    super(0, ComputableReals.SINGLETON, CR.TWO.pow(new Q(-1, 2)));
  }
}
