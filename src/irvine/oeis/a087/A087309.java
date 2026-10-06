package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a086.A086786;

/**
 * A087309 Least number that ends an arithmetic progression of n numbers with the same prime signature.
 * @author Sean A. Irvine
 */
public class A087309 extends A086786 {

  @Override
  public Z next() {
    mRow.clear();
    step();
    return Z.valueOf(mRow.peekLast());
  }
}
