package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173000.
 * @author Sean A. Irvine
 */
public class A173000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173000() {
    super(new long[] {59049, -32805, 7290, -810, 45}, new long[] {1, 45, 1215, 25515, 459270});
  }
}
