package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060889 <code>n^8-n^7+n^5-n^4+n^3-n+1</code>.
 * @author Sean A. Irvine
 */
public class A060889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060889() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1, 151, 4561, 49981, 315121, 1406371, 4956001, 14709241});
  }
}
