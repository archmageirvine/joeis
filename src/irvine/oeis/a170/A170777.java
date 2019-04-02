package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170777 a(n) = n^8*(n^5 + 1)/2.
 * @author Sean A. Irvine
 */
public class A170777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170777() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {0, 1, 4224, 800442, 33587200, 610546875, 6531186816L, 48447387604L, 274886295552L, 1270954437525L, 5000050000000L, 17261463251406L, 53496817680384L, 151437961161487L});
  }
}
