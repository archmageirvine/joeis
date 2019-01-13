package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239609.
 * @author Sean A. Irvine
 */
public class A239609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239609() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1, 9409, 332929, 3690241, 23049601, 101626561, 354079489, 1040514049});
  }
}
