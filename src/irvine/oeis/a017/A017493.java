package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017493 a(n) = (11*n + 8)^9.
 * @author Sean A. Irvine
 */
public class A017493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017493() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {134217728, 322687697779L, 19683000000000L, 327381934393961L, 2779905883635712L, 15633814156853823L, 66540410775079424L, 231616946283203125L, 692533995824480256L, 1838459212420154507L});
  }
}
