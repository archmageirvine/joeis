package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199494 <code>3*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199494() {
    super(new long[] {-8, 9}, new long[] {4, 25});
  }
}
