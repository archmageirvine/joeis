package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156162.
 * @author Sean A. Irvine
 */
public class A156162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156162() {
    super(new long[] {1, -35, 35}, new long[] {625, 18769, 635209});
  }
}
