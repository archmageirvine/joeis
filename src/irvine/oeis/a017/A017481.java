package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017481 <code>a(n) = (11*n + 7)^9</code>.
 * @author Sean A. Irvine
 */
public class A017481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017481() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {40353607, 198359290368L, 14507145975869L, 262144000000000L, 2334165173090451L, 13537086546263552L, 58871586708267913L, 208215748530929664L, 630249409724609375L, 1689478959002692096L});
  }
}
