package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084517 First occurrence of n in A084511.
 * @author Sean A. Irvine
 */
public class A084517 extends InverseSequence {

  /** Construct the sequence. */
  public A084517() {
    super(0, 0, new A084511());
  }
}
