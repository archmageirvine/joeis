package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206371 <code>31*2^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A206371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206371() {
    super(new long[] {-2, 3}, new long[] {32, 63});
  }
}
