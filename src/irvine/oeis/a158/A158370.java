package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158370 <code>576n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158370() {
    super(new long[] {-1, 2}, new long[] {577, 1153});
  }
}
