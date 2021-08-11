package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a071.A071642;

/**
 * A050229 Numbers k such that for any x in 1..k-1 there exists a y in 0..k-2 such that x^2 == 2^y (mod k).
 * @author Sean A. Irvine
 */
public class A050229 extends A071642 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
