package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069186 Numbers n such that core(n)=floor(sqrt(n)), where core(x)=A007913(x) is the squarefree part of x and floor(sqrt(x))=A000196(x).
 * @author Sean A. Irvine
 */
public class A069186 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).core().equals(mN.sqrt())) {
        return mN;
      }
    }
  }
}

