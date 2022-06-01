package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253923 Octagonal numbers (A000567) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A253923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253923() {
    super(new long[] {1, -1, -232322, 232322, 1}, new long[] {1, 7701, 219781, 1789106881, 51059956641L});
  }
}
