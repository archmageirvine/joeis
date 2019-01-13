package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086090.
 * @author Sean A. Irvine
 */
public class A086090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086090() {
    super(new long[] {18, -21, 8}, new long[] {1, 5, 22});
  }
}
