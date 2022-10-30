package irvine.oeis.a039;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000796;

/**
 * A039918 Partial sums of decimal digits of Pi (ignoring the initial 3).
 * @author Sean A. Irvine
 */
public class A039918 extends PartialSumSequence {

  /** Construct the sequence. */
  public A039918() {
    super(1, new SkipSequence(new A000796(), 1));
  }
}
