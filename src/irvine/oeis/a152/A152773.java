package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152773 3 times heptagonal numbers: <code>a(n) = 3n(5n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A152773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152773() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 21});
  }
}
