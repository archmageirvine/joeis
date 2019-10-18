package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;

/**
 * A026945 A bisection of the Motzkin numbers <code>A001006</code>.
 * @author Sean A. Irvine
 */
public class A026945 extends A001006 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
