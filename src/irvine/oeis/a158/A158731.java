package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158731 <code>a(n) = 1156*n^2 + 34</code>.
 * @author Sean A. Irvine
 */
public class A158731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158731() {
    super(new long[] {1, -3, 3}, new long[] {34, 1190, 4658});
  }
}
