package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014899 a(n) = (16^(n+1) - 15*n - 16)/225.
 * @author Sean A. Irvine
 */
public class A014899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014899() {
    super(new long[] {16, -33, 18}, new long[] {0, 1, 18});
  }
}
