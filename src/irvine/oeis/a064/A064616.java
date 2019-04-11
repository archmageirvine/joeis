package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064616 <code>(10^n-1)*(91/81)-n*10^n/9</code>.
 * @author Sean A. Irvine
 */
public class A064616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064616() {
    super(new long[] {100, -120, 21}, new long[] {9, 89, 789});
  }
}
