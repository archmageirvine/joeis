package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065204 Least m such that A065203(m)=n.
 * @author Sean A. Irvine
 */
public class A065204 extends InverseSequence {

  /** Construct the sequence. */
  public A065204() {
    super(1, new A065203(), 1, 0);
  }
}
