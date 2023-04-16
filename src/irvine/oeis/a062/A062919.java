package irvine.oeis.a062;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004086;

/**
 * A062919 "Reverse factorials": product of the digit reversals of the numbers 1 through n.
 * @author Sean A. Irvine
 */
public class A062919 extends PartialProductSequence {

  /** Construct the sequence. */
  public A062919() {
    super(0, new PrependSequence(new SkipSequence(new A004086(), 1), 1));
  }
}

