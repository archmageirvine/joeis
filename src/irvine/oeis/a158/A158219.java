package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158219 <code>169n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158219() {
    super(new long[] {-1, 2}, new long[] {168, 337});
  }
}
