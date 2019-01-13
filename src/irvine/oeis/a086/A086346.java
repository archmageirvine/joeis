package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086346.
 * @author Sean A. Irvine
 */
public class A086346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086346() {
    super(new long[] {8, 12, 2}, new long[] {1, 3, 18});
  }
}
