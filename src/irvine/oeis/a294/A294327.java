package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294327.
 * @author Sean A. Irvine
 */
public class A294327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294327() {
    super(new long[] {100, -120, 21}, new long[] {0, 18, 288});
  }
}
