package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157664.
 * @author Sean A. Irvine
 */
public class A157664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157664() {
    super(new long[] {1, -3, 3}, new long[] {80801, 321601, 722401});
  }
}
