package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019783 Expansion of 1/((1-5x)(1-6x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A019783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019783() {
    super(new long[] {240, -118, 19}, new long[] {1, 19, 243});
  }
}
