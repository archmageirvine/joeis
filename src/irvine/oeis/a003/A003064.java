package irvine.oeis.a003;

import irvine.oeis.InverseSequence;

/**
 * A003064 a(n) = smallest number with shortest addition chain of length n.
 * @author Sean A. Irvine
 */
public class A003064 extends InverseSequence {

  /** Construct the sequence. */
  public A003064() {
    super(0, 0, new A003313(), 1);
  }
}
