package irvine.oeis.a086;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A086713 A squarefree sequence: define a mapping from the set of strings over the alphabet {0,1,2} by f(0)=01201, f(1)=020121, f(2)=0212021 and f of the concatenation of s and t is the concatenation of f(s) and f(t). Then each of 0, f(0), f(f(0)), ... is an initial substring of the next; their limit is the infinite sequence given above.
 * @author Sean A. Irvine
 */
public class A086713 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A086713() {
    super("0", "0", "0->01201, 1->020121, 2->0212021");
  }
}

