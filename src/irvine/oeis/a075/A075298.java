package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075298 Inverted (definition in <code>A075193)</code> generalized tribonacci numbers <code>A001644</code>.
 * @author Sean A. Irvine
 */
public class A075298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075298() {
    super(new long[] {1, -1, -1}, new long[] {1, 1, -5});
  }
}
