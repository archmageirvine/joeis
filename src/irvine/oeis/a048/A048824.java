package irvine.oeis.a048;

import irvine.oeis.PositionOfNSequence;

/**
 * A048824 a(n) = least k such that A048823(n) = k.
 * @author Sean A. Irvine
 */
public class A048824 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A048824() {
    super(new A048823(), 0, 2);
  }
}
