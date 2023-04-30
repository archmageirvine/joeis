package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016833 a(n) = (4n+2)^9.
 * @author Sean A. Irvine
 */
public class A016833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016833() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 10077696, 1000000000, 20661046784L, 198359290368L, 1207269217792L, 5429503678976L, 19683000000000L, 60716992766464L, 165216101262848L});
  }
}
