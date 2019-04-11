package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048498 <code>2^(n-1)*(5n-8)+5</code>.
 * @author Sean A. Irvine
 */
public class A048498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048498() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 9});
  }
}
