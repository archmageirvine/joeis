package irvine.oeis.a025;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002033;

/**
 * A025523 a(n) = 1 + Sum_{ k &lt; n and k | n} a(k).
 * @author Sean A. Irvine
 */
public class A025523 extends PartialSumSequence {

  /** Construct the sequence. */
  public A025523() {
    super(1, new A002033());
  }
}
