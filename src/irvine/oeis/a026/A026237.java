package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026237 a(n) = position of n in A026236.
 * @author Sean A. Irvine
 */
public class A026237 extends InverseSequence {

  /** Construct the sequence. */
  public A026237() {
    super(new A026236());
  }
}
