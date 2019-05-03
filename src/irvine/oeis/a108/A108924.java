package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108924 <code>J(n)^2+J(n+1)^2</code>, with <code>J(n)</code> the Jacobsthal number <code>A001045(n)</code>.
 * @author Sean A. Irvine
 */
public class A108924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108924() {
    super(new long[] {-8, 6, 3}, new long[] {1, 2, 10});
  }
}
