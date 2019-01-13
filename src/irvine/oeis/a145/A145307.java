package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145307.
 * @author Sean A. Irvine
 */
public class A145307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145307() {
    super(new long[] {1, -456303, 456303}, new long[] {7663, 3514673818L, 1603752710517223L});
  }
}
