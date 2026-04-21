package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084507 First occurrence of n in A084501.
 * @author Sean A. Irvine
 */
public class A084507 extends InverseSequence {

  /** Construct the sequence. */
  public A084507() {
    super(0, 0, new A084501());
  }
}
