package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A066301 a(n) = 0 if n is squarefree, otherwise 1 + a(n/rad(n)) where rad = A007947 (squarefree kernel).
 * @author Sean A. Irvine
 */
public class A066301 extends MemorySequence {

  {
    add(null);
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final FactorSequence fs = Jaguar.factor(size());
    if (fs.isSquareFree()) {
      return Z.ZERO;
    }
    return a(size() / fs.squareFreeKernel().intValueExact()).add(1);
  }
}

