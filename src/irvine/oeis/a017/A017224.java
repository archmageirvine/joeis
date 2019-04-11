package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017224 <code>a(n) = (9*n + 5)^4</code>.
 * @author Sean A. Irvine
 */
public class A017224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017224() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 38416, 279841, 1048576, 2825761});
  }
}
