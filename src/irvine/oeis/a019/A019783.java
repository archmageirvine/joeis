package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019783 Expansion of 1/((1-5*x)*(1-6*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A019783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019783() {
    super(new long[] {240, -118, 19}, new long[] {1, 19, 243});
  }
}
