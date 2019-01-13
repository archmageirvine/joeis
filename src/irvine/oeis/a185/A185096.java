package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185096.
 * @author Sean A. Irvine
 */
public class A185096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185096() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 36, 300, 1176, 3240});
  }
}
