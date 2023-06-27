package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253514 Centered heptagonal numbers (A069099) which are also centered octagonal numbers (A016754).
 * @author Sean A. Irvine
 */
public class A253514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253514() {
    super(1, new long[] {1, -899, 899}, new long[] {1, 841, 755161});
  }
}
