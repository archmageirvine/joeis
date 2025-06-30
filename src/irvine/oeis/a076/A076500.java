package irvine.oeis.a076;

import irvine.oeis.DifferenceSequence;

/**
 * A076500 Distance between natural sculptures.
 * @author Sean A. Irvine
 */
public class A076500 extends DifferenceSequence {

  /** Construct the sequence. */
  public A076500() {
    super(1, new A076450());
  }
}
