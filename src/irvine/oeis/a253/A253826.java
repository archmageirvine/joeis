package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253826 Indices of centered octagonal numbers (A016754) which are also triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A253826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253826() {
    super(new long[] {1, -35, 35}, new long[] {1, 18, 595});
  }
}
