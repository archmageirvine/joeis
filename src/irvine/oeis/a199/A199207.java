package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199207 <code>7*4^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199207() {
    super(new long[] {-4, 5}, new long[] {8, 29});
  }
}
