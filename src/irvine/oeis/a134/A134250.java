package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134250.
 * @author Sean A. Irvine
 */
public class A134250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134250() {
    super(new long[] {-1, 4, -2}, new long[] {4, 1, 7});
  }
}
