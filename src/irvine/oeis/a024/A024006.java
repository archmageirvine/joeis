package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001016;

/**
 * A024006 a(n) = 1 - n^8.
 * @author Sean A. Irvine
 */
public class A024006 extends A001016 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
