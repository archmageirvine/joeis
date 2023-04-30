package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199680 a(n) = (11*9^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199680() {
    super(new long[] {-9, 10}, new long[] {6, 50});
  }
}
