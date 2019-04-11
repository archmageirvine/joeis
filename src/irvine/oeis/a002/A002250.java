package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002250 <code>4^n-2*3^n</code>.
 * @author Sean A. Irvine
 */
public class A002250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002250() {
    super(new long[] {-12, 7}, new long[] {-1, -2});
  }
}
