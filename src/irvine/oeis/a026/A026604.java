package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026604 <code>a(n) = s(1) + s(2) + ... + s(n)</code>, where s <code>= A026600</code>.
 * @author Sean A. Irvine
 */
public class A026604 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026604() {
    super(new A026600());
  }
}
