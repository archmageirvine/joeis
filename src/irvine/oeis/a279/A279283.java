package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279283 Self-composition of the tetrahedral (or triangular pyramidal) numbers; g.f.: A(x) = G(G(x)), where G(x) = g.f. of A000292.
 * @author Sean A. Irvine
 */
public class A279283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279283() {
    super(new long[] {-1, 16, -120, 564, -1868, 4632, -8894, 13468, -16206, 15476, -11612, 6708, -2885, 876, -174, 20}, new long[] {0, 1, 8, 52, 304, 1650, 8492, 42000, 201356, 941367, 4310480, 19395042, 85972228, 376185250, 1627518840, 6971209090L});
  }
}
