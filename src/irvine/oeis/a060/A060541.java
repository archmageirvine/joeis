package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060541 <code>C(4n,4)</code>.
 * @author Sean A. Irvine
 */
public class A060541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060541() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 70, 495, 1820, 4845});
  }
}
