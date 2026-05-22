package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084933 Inverse of A084937.
 * @author Sean A. Irvine
 */
public class A084933 extends InverseSequence {

  /** Construct the sequence. */
  public A084933() {
    super(1, new A084937());
  }
}

