package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123219.
 * @author Sean A. Irvine
 */
public class A123219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123219() {
    super(new long[] {1, -29, -174, 174, 29}, new long[] {1, 1, 81, 2401, 83521});
  }
}
