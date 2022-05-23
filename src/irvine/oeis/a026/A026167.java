package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026167 a(n) is the position of n in A026166.
 * @author Sean A. Irvine
 */
public class A026167 extends InverseSequence {

  /** Construct the sequence. */
  public A026167() {
    super(new A026166());
  }
}
