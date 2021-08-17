package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A050675 Numbers n such that concatenation of numbers from 1 to n is nonsquarefree.
 * @author Sean A. Irvine
 */
public class A050675 extends A007908 {

  @Override
  public Z next() {
    while (true) {
      if (!Jaguar.factor(super.next()).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
