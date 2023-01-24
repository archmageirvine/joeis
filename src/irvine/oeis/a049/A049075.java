package irvine.oeis.a049;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A049075 Eigensequence of a power series transformation.
 * @author Sean A. Irvine
 */
public class A049075 extends MemorySequence {

  {
    setOffset(1);
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
      b.add(a(k).subtract((k & 3) == 0 ? a(k / 2) : Z.ZERO));
    }
    return EulerTransformUtils.eulerTransform(b, n - 1);
  }
}
