package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096027 Numbers n such that <code>(n+j) mod (2+j) = 1</code> for j from 0 to 10 and <code>(n+11) mod 13</code> &lt;&gt; 1.
 * @author Sean A. Irvine
 */
public class A096027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096027() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {27723, 55443, 83163, 110883, 138603, 166323, 194043, 221763, 249483, 277203, 304923, 332643, 388083});
  }
}
