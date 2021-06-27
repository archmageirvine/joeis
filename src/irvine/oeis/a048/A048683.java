package irvine.oeis.a048;

import irvine.oeis.PositionSequence;

/**
 * A048683 Values of n for which the difference of maximal and central squarefree kernel numbers dividing values of {C(n,k)} or A001405(n) is zero.
 * @author Sean A. Irvine
 */
public class A048683 extends PositionSequence {

  /** Construct the sequence. */
  public A048683() {
    super(1, new A048682(), 0);
  }
}
