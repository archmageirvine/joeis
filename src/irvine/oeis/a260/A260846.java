package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260846.
 * @author Sean A. Irvine
 */
public class A260846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260846() {
    super(new long[] {45, -63, 19}, new long[] {2, 48, 770});
  }
}
