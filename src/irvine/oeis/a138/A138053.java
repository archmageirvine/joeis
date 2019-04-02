package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138053 Sequence generated from the Z/4Z addition table considered as a matrix.
 * @author Sean A. Irvine
 */
public class A138053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138053() {
    super(new long[] {19440, 5184, -2592, -576, 93, 12}, new long[] {0, 55, 510, 8931, 125082, 1914687});
  }
}
