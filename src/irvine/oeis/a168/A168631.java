package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168631 a(n) = n^6*(n^7 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168631() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {0, 1, 4128, 797526, 33556480, 610359375, 6530370336L, 48444564028L, 274878038016L, 1270933179885L, 5000000500000L, 17261356957746L, 53496604182528L, 151437555709531L});
  }
}
