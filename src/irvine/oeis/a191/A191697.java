package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191697.
 * @author Sean A. Irvine
 */
public class A191697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191697() {
    super(new long[] {2, 2, 0}, new long[] {0, 4, 6});
  }
}
