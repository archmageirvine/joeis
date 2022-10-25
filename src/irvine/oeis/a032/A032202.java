package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A032202 Sequence (a(n): n &gt;= 1) that shifts left 2 places under the "CIK" (necklace, indistinct, unlabeled) transform and satisfies a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A032202 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.ONE;
    }
    final CycleTransformSequence cts = new CycleTransformSequence(toFiniteSequence(), 0);
    for (int k = 1; k < size(); ++k) {
      cts.next();
    }
    return cts.next();
  }
}
