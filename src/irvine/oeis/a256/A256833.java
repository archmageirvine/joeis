package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256833 <code>a(n) = (4*n+3)*(4*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A256833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256833() {
    super(new long[] {1, -3, 3}, new long[] {6, 42, 110});
  }
}
