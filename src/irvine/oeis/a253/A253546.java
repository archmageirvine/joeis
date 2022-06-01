package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253546 Centered hexagonal numbers (A003215) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253546() {
    super(new long[] {1, -675, 675}, new long[] {1, 547, 368551});
  }
}
