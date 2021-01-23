package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199682 2*10^n+1.
 * @author Sean A. Irvine
 */
public class A199682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199682() {
    super(new long[] {-10, 11}, new long[] {3, 21});
  }
}
