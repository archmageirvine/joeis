package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199564 <code>6*9^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199564() {
    super(new long[] {-9, 10}, new long[] {7, 55});
  }
}
