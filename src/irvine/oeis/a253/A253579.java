package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253579 Centered pentagonal numbers <code>(A005891)</code> which are also centered octagonal numbers <code>(A016754)</code>.
 * @author Sean A. Irvine
 */
public class A253579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253579() {
    super(new long[] {1, -1, -2079362, 2079362, 1}, new long[] {1, 22801, 1666681, 47411143081L, 3465632747641L});
  }
}
