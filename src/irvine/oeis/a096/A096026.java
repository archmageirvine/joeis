package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096026 Numbers n such that (n+j) mod (2+j) = 1 for j from 0 to 8 and (n+9) mod 11 &lt;&gt; 1.
 * @author Sean A. Irvine
 */
public class A096026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096026() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {2523, 5043, 7563, 10083, 12603, 15123, 17643, 20163, 22683, 25203, 30243});
  }
}
