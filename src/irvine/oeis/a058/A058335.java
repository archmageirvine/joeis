package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a005.A005282;

/**
 * A058335 a(n) = least value such that sequence increases and pairwise differences are unique.
 * @author Sean A. Irvine
 */
public class A058335 extends A005282 {

  /** Construct the sequence. */
  public A058335() {
    super(Z.ONE, Z.FOUR);
  }
}

