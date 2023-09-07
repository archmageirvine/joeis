package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065624 Smallest m such that A065623(m) = n.
 * @author Sean A. Irvine
 */
public class A065624 extends InverseSequence {

  /** Construct the sequence. */
  public A065624() {
    super(0, new A065623(), 0);
  }
}

