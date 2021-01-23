package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193392 Hyper-Wiener index of a benzenoid consisting of a spiral chain of n hexagons (s=1; see the Gutman et al. reference).
 * @author Sean A. Irvine
 */
public class A193392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193392() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 215, 636, 1401, 2622});
  }
}
