package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016965.
 * @author Sean A. Irvine
 */
public class A016965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016965() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 1000000000, 68719476736L, 1207269217792L, 10578455953408L, 60716992766464L, 262144000000000L, 922190162669056L, 2779905883635712L, 7427658739644928L});
  }
}
