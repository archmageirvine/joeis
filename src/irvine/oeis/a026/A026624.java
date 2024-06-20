package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026624 a(n) = Sum_{j=0..n} Sum_{k=0..j} A026615(j, k).
 * @author Sean A. Irvine
 */
public class A026624 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026624() {
    super(new A026622());
  }
}
