package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135994 First differences of <code>A135992</code>.
 * @author Sean A. Irvine
 */
public class A135994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135994() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 2, -1, 6});
  }
}
