package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002572;

/**
 * A014167 Partial sums of binary rooted tree numbers.
 * @author Sean A. Irvine
 */
public class A014167 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014167() {
    super(1, new A002572().skip(1));
  }
}
