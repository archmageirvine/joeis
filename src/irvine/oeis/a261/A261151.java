package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261151 <code>a(n) = 11410337850553 + (n-1)*4609098694200</code>.
 * @author Sean A. Irvine
 */
public class A261151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261151() {
    super(new long[] {-1, 2}, new long[] {11410337850553L, 11871247719973L});
  }
}
