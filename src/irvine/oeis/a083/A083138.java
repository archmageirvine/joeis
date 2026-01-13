package irvine.oeis.a083;

import irvine.oeis.FilterSequence;

/**
 * A083138 Composite numbers in A083137.
 * @author Sean A. Irvine
 */
public class A083138 extends FilterSequence {

  /** Construct the sequence. */
  public A083138() {
    super(new A083137(), COMPOSITE);
  }
}

