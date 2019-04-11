package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199552 <code>4*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199552() {
    super(new long[] {-8, 9}, new long[] {5, 33});
  }
}
