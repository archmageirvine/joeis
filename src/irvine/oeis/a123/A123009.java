package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123009.
 * @author Sean A. Irvine
 */
public class A123009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123009() {
    super(new long[] {49, 2}, new long[] {1, 7});
  }
}
