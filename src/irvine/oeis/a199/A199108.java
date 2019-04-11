package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199108 <code>4*3^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199108() {
    super(new long[] {-3, 4}, new long[] {5, 13});
  }
}
