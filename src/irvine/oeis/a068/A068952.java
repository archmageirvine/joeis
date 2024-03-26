package irvine.oeis.a068;

import irvine.oeis.FilterSequence;

/**
 * A068952 Squares in A068949.
 * @author Sean A. Irvine
 */
public class A068952 extends FilterSequence {

  /** Construct the sequence. */
  public A068952() {
    super(1, new A068949(), SQUARE);
  }
}

