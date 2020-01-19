package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A147527 Numbers k such that there exists x in N : <code>(x + 103)^3 - x^3 = k^2</code>.
 * @author Sean A. Irvine
 */
public class A147527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147527() {
    super(new long[] {-1, 128405450990L},
      new Z[] {
        Z.valueOf(93645643),
        new Z("12024611022569890927")
    });
  }
}
