package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253579 Centered pentagonal numbers (A005891) which are also centered octagonal numbers (A016754).
 * @author Sean A. Irvine
 */
public class A253579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253579() {
    super(1, new long[] {1, -1, -2079362, 2079362, 1}, new long[] {1, 22801, 1666681, 47411143081L, 3465632747641L});
  }
}
