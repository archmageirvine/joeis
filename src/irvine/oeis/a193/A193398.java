package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193398 Hyper-Wiener index of a benzenoid consisting of a double-step spiral chain of n hexagons <code>(n &gt;= 2, s = 21</code>; see the Gutman et al. <code>reference)</code>.
 * @author Sean A. Irvine
 */
public class A193398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193398() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {215, 636, 1557, 3018, 5555, 8968, 14225, 20790});
  }
}
