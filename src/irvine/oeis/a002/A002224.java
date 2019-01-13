package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002224.
 * @author Sean A. Irvine
 */
public class A002224 extends A002223 {

  @Override
  protected Z residueClass() {
    return Z.ONE;
  }
}
