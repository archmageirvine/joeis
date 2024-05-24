package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069806 Smallest k &gt; n such that the squarefree part of n divides the squarefree part of k.
 * @author Sean A. Irvine
 */
public class A069806 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z core = Functions.CORE.z(++mN);
    long k = mN;
    while (true) {
      if (Functions.CORE.z(++k).mod(core).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

