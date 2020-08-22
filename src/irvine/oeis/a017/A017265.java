package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017265 a(n) = (9*n + 8)^9.
 * @author Sean A. Irvine
 */
public class A017265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017265() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {134217728, 118587876497L, 5429503678976L, 78815638671875L, 618121839509504L, 3299763591802133L, 13537086546263552L, 45848500718449031L, 134217728000000000L, 350356403707485209L});
  }
}
