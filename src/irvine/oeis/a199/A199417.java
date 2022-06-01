package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199417 (3*7^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199417() {
    super(new long[] {-7, 8}, new long[] {2, 11});
  }
}
