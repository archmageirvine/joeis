package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A037918 Numbers n such that the Fibonacci number F(n) is squarefree.
 * @author Sean A. Irvine
 */
public class A037918 extends A000045 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(super.next()).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
