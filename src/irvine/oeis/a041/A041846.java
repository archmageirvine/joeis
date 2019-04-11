package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041846 Numerators of continued fraction convergents to <code>sqrt(445)</code>.
 * @author Sean A. Irvine
 */
public class A041846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041846() {
    super(new long[] {1, 0, 0, 0, 0, 9324, 0, 0, 0, 0}, new long[] {21, 211, 232, 443, 4662, 196247, 1967132, 2163379, 4130511, 43468489});
  }
}
