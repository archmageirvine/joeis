package irvine.oeis.a072;

import irvine.oeis.InverseSequence;

/**
 * A072138 Smallest k whose 'Reverse and Subtract' trajectory has a preperiodic part of length n.
 * @author Sean A. Irvine
 */
public class A072138 extends InverseSequence {

  /** Construct the sequence. */
  public A072138() {
    super(0, new A072137(), 0);
  }
}
