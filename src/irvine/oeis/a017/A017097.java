package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017097 <code>a(n) = (8*n + 2)^9</code>.
 * @author Sean A. Irvine
 */
public class A017097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017097() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 1000000000, 198359290368L, 5429503678976L, 60716992766464L, 406671383849472L, 1953125000000000L, 7427658739644928L, 23762680013799936L, 66540410775079424L});
  }
}
