package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039623 <code>a(n) = n^2*(n^2+3)/4</code>.
 * @author Sean A. Irvine
 */
public class A039623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039623() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 27, 76, 175});
  }
}
