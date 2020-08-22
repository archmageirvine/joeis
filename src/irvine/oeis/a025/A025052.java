package irvine.oeis.a025;

import irvine.oeis.FiniteSequence;

/**
 * A025052 Numbers not of form ab + bc + ca for 1&lt;=a&lt;=b&lt;=c (probably the list is complete).
 * @author Sean A. Irvine
 */
public class A025052 extends FiniteSequence {

  // This list is complete assuming GRH

  /** Construct the sequence. */
  public A025052() {
    super(1, 2, 4, 6, 10, 18, 22, 30, 42, 58, 70, 78, 102, 130, 190, 210, 330, 462);
  }
}
