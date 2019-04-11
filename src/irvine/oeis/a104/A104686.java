package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104686 <code>n*(n+1)/2 (mod 6)</code>.
 * @author Sean A. Irvine
 */
public class A104686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104686() {
    super(new long[] {1, 0, 0, -1, 0, 0, 1, 0, 0}, new long[] {0, 1, 3, 0, 4, 3, 3, 4, 0});
  }
}
