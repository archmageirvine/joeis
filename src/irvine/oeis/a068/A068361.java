package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068361 Numbers n such that the number of squarefree numbers between prime(n) and prime(n+1) = prime(n+1)-prime(n)-1.
 * @author Sean A. Irvine
 */
public class A068361 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z t = super.next().add(1);
      boolean ok = true;
      while (!t.isProbablePrime()) {
        if (!Jaguar.factor(t).isSquareFree()) {
          ok = false;
          break;
        }
        t = t.add(1);
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

