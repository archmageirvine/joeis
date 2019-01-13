package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251924.
 * @author Sean A. Irvine
 */
public class A251924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251924() {
    super(new long[] {1, -35, 35}, new long[] {0, 34, 1188});
  }
}
