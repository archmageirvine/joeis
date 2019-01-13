package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A279274.
 * @author Sean A. Irvine
 */
public class A279274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279274() {
    super(new long[] {1, -1, 0, -885289046402L, 885289046402L, 0, 1},
      new Z[] {
        Z.valueOf(238),
        Z.valueOf(685382117),
        Z.valueOf(380358424875L),
        Z.valueOf(211083026086753L),
        new Z("606761281164154030532"),
        new Z("336727147248939746087250"),
        new Z("186869490875990437334549968")
      });
  }
}
