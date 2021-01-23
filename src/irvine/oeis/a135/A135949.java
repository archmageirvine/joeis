package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135949 a(n)=5a(n-2)+2a(n-3).
 * @author Sean A. Irvine
 */
public class A135949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135949() {
    super(new long[] {2, 5, 0}, new long[] {1, -1, 1});
  }
}
