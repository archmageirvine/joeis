package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185270 a(n) = 648 * n^6.
 * @author Sean A. Irvine
 */
public class A185270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185270() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 648, 41472, 472392, 2654208, 10125000, 30233088});
  }
}
