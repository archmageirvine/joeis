package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134430 Period 4: repeat [1, -2, -2, 1].
 * @author Sean A. Irvine
 */
public class A134430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134430() {
    super(new long[] {1, -1, 1}, new long[] {1, -2, -2});
  }
}
