package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001017;

/**
 * A024007 a(n) = 1 - n^9.
 * @author Sean A. Irvine
 */
public class A024007 extends A001017 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
