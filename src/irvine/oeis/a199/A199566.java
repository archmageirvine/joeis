package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199566 <code>(7*9^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199566() {
    super(new long[] {-9, 10}, new long[] {4, 32});
  }
}
