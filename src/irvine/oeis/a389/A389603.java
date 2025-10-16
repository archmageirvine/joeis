package irvine.oeis.a389;

import irvine.oeis.InverseSequence;

/**
 * A389603 Smallest k for which A389362(k) = n.
 * @author Sean A. Irvine
 */
public class A389603 extends InverseSequence {

  /** Construct the sequence. */
  public A389603() {
    super(1, 0, new A389362());
  }
}

