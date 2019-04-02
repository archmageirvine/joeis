package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041773 Denominators of continued fraction convergents to sqrt(407).
 * @author Sean A. Irvine
 */
public class A041773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041773() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 5326, 0, 0, 0, 0, 0}, new long[] {1, 5, 6, 17, 23, 132, 5303, 26647, 31950, 90547, 122497, 703032});
  }
}
