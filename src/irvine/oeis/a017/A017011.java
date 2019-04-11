package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017011 <code>a(n) = (7*n + 2)^7</code>.
 * @author Sean A. Irvine
 */
public class A017011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017011() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 4782969, 268435456, 3404825447L, 21870000000L, 94931877133L, 319277809664L, 897410677851L});
  }
}
