package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177187 Union of <code>A057080</code> and <code>A001090</code>.
 * @author Sean A. Irvine
 */
public class A177187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177187() {
    super(new long[] {-1, 0, 8, 0}, new long[] {1, 1, 9, 8});
  }
}
