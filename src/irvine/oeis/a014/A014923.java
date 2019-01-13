package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014923.
 * @author Sean A. Irvine
 */
public class A014923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014923() {
    super(new long[] {81, -99, 19}, new long[] {1, 19, 262});
  }
}
