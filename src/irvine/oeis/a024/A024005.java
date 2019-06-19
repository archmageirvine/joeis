package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001015;

/**
 * A024005 <code>a(n) = 1 - n^7</code>.
 * @author Sean A. Irvine
 */
public class A024005 extends A001015 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
