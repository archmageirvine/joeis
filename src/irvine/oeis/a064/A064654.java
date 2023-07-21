package irvine.oeis.a064;

import irvine.oeis.a195.A195376;
import irvine.oeis.base.RunLengthSequence;

/**
 * A064654 Length of n-th run of evens or odds in A064413.
 * @author Sean A. Irvine
 */
public class A064654 extends RunLengthSequence {

  /** Construct the sequence. */
  public A064654() {
    super(1, new A195376());
  }
}
