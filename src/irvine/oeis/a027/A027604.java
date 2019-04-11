package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027604 <code>a(n) = n^3 + (n+1)^3 + (n+2)^3 + (n+3)^3 + (n+4)^3</code>.
 * @author Sean A. Irvine
 */
public class A027604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027604() {
    super(new long[] {-1, 4, -6, 4}, new long[] {100, 225, 440, 775});
  }
}
