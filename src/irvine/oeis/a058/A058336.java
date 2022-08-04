package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a005.A005282;

/**
 * A058336 a(n) = least value such that sequence increases and pairwise differences are unique.
 * @author Sean A. Irvine
 */
public class A058336 extends A005282 {

  /** Construct the sequence. */
  public A058336() {
    super(Z.ONE, Z.FIVE);
  }
}

