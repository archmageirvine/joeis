package irvine.oeis.a083;

import irvine.oeis.InverseSequence;

/**
 * A083665 Inverse of A083664.
 * @author Sean A. Irvine
 */
public class A083665 extends InverseSequence {

  /** Construct the sequence. */
  public A083665() {
    super(1, new A083664());
  }
}
