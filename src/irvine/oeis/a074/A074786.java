package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074786 Numbers k such that phi(k) = Sum_{d|k} core(d) where core(x) is the squarefree part of x (A007913).
 * @author Sean A. Irvine
 */
public class A074786 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).equals(Integers.SINGLETON.sumdiv(mN, Functions.CORE::z))) {
        return Z.valueOf(mN);
      }
    }
  }
}
