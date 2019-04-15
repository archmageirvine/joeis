package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027784 <code>a(n) = 11*(n+1)*binomial(n+2,11)/2</code>.
 * @author Sean A. Irvine
 */
public class A027784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027784() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {55, 726, 5148, 26026, 105105, 360360, 1089088, 2975544, 7482618, 17551820, 38798760, 81477396, 163601438});
  }
}
