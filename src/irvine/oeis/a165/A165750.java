package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165750 a(n) = (10/11)*(2+9*(-10)^(n-1)).
 * @author Sean A. Irvine
 */
public class A165750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165750() {
    super(new long[] {10, -9}, new long[] {1, 10});
  }
}
