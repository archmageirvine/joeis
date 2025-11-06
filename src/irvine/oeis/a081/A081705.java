package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a005.A005101;

/**
 * A081705 k-tuple abundance of abundant numbers.
 * @author Sean A. Irvine
 */
public class A081705 extends A005101 {

  @Override
  public Z next() {
    return Z.valueOf(A081699.count(super.next()));
  }
}
