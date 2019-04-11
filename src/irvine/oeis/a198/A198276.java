package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198276 <code>19*2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198276() {
    super(new long[] {-2, 3}, new long[] {18, 37});
  }
}
