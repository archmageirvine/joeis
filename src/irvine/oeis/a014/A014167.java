package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002572;

/**
 * A014167.
 * @author Sean A. Irvine
 */
public class A014167 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014167() {
    super(new SkipSequence(new A002572(), 1));
  }
}
