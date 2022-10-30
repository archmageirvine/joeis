package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026604 a(n) = s(1) + s(2) + ... + s(n), where s = A026600.
 * @author Sean A. Irvine
 */
public class A026604 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026604() {
    super(1, new A026600());
  }
}
