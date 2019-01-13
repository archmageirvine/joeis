package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162258.
 * @author Sean A. Irvine
 */
public class A162258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162258() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 9, 36, 86});
  }
}
