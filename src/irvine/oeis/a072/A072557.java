package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072557.
 * @author Sean A. Irvine
 */
public class A072557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072557() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 11, 16, 17, 18, 23});
  }
}
