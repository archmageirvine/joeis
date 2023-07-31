package irvine.oeis.a203;
// manually esf at 2023-07-31

import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.transform.ElementarySymmetricFunctionSequence;

/**
 * A203238 a(n)=(n-1)-st elementary symmetric function of the first n terms of (2, -4, 6, -8, 10, ...).
 * @author Georg Fischer
 */
public class A203238 extends ElementarySymmetricFunctionSequence {

  /** Construct the sequence. */
  public A203238() {
    super(new HolonomicRecurrence(0, "[0,-1,-2,-1]", "2", 0), 0);
  }
}
