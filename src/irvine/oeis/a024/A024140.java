package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024140 <code>a(n) = 12^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024140() {
    super(new long[] {-12, 13}, new long[] {0, 11});
  }
}
