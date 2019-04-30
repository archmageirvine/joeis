package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188495 Number of permutations p on the set <code>[n]</code> with the properties that <code>abs(p(i)-i) &lt;= 3</code> for all <code>i, p(1) &lt;= 2</code>, and <code>p(4) &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A188495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188495() {
    super(new long[] {1, 2, 0, 2, 4, -2, -10, -16, -2, 8, 10, 0, 2, 2}, new long[] {0, 1, 2, 4, 10, 36, 120, 368, 1089, 3304, 10168, 31312, 95880, 293120});
  }
}
