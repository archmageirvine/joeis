package irvine.oeis.a049;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A049075 Eigensequence of a power series transformation.
 * @author Sean A. Irvine
 */
public class A049075 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    final ArrayList<Z> b = new ArrayList<>();
    for (int k = 1; k < n; ++k) {
      b.add(get(k).subtract((k & 3) == 0 ? get(k / 2) : Z.ZERO));
    }
    return EulerTransformSequence.eulerTransform(b, n - 1);
  }
}
