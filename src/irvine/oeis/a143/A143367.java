package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143367 The Szeged index of third type dendrimer nanostar which has grown n stages.
 * @author Sean A. Irvine
 */
public class A143367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143367() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {9412, 30652, 123148, 564844, 2726572});
  }
}
