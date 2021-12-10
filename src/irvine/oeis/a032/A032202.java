package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.transform.CycleTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;

/**
 * A032202 Sequence (a(n): n &gt;= 1) that shifts left 2 places under the "CIK" (necklace, indistinct, unlabeled) transform and satisfies a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A032202 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.ONE;
    }
    final CycleTransformSequence cts = new CycleTransformSequence(new FiniteSequence(this), 0);
    for (int k = 1; k < size(); ++k) {
      cts.next();
    }
    return cts.next();
  }
}
