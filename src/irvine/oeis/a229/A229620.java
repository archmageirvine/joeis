package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229620 Incorrect version of <code>A045949</code>.
 * @author Sean A. Irvine
 */
public class A229620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229620() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 6, 38, 116, 256});
  }
}
