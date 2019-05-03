package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096026 Numbers n such that <code>(n+j) mod (2+j) = 1</code> for j from 0 to 8 and <code>(n+9) mod 11</code> &lt;&gt; 1.
 * @author Sean A. Irvine
 */
public class A096026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096026() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {2523, 5043, 7563, 10083, 12603, 15123, 17643, 20163, 22683, 25203, 30243});
  }
}
