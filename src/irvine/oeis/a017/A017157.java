package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017157 <code>a(n) = (8*n + 7)^9</code>.
 * @author Sean A. Irvine
 */
public class A017157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017157() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {40353607, 38443359375L, 1801152661463L, 26439622160671L, 208728361158759L, 1119130473102767L, 4605366583984375L, 15633814156853823L, 45848500718449031L, 119851595982618319L});
  }
}
