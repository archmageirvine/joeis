package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140961 Number of 3 X n {0,1}-matrices such that: (a) first and second row have a common 1, (b) second and third row have a common 1.
 * @author Sean A. Irvine
 */
public class A140961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140961() {
    super(new long[] {240, -118, 19}, new long[] {1, 17, 205});
  }
}
