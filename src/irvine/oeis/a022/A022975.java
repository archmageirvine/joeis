package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022975 <code>a(n) = 19 - n</code>.
 * @author Sean A. Irvine
 */
public class A022975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022975() {
    super(new long[] {-1, 2}, new long[] {19, 18});
  }
}
