package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157839 1728000n - 1451760.
 * @author Sean A. Irvine
 */
public class A157839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157839() {
    super(new long[] {-1, 2}, new long[] {276240, 2004240});
  }
}
