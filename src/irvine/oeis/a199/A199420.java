package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199420 a(n) = (5*7^n+1)/3.
 * @author Sean A. Irvine
 */
public class A199420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199420() {
    super(new long[] {-7, 8}, new long[] {2, 12});
  }
}
