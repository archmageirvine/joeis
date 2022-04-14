package irvine.oeis.a003;

import irvine.oeis.PositionOfNSequence;

/**
 * A003064 a(n) = smallest number with shortest addition chain of length n.
 * @author Sean A. Irvine
 */
public class A003064 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A003064() {
    super(new A003313(), 0, 1);
  }
}
