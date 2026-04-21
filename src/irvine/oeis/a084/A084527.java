package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084527 First occurrence of n in A084521.
 * @author Sean A. Irvine
 */
public class A084527 extends InverseSequence {

  /** Construct the sequence. */
  public A084527() {
    super(0, 0, new A084521());
  }
}
