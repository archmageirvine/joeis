package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A032291 Shifts left 2 places under "DIK" (bracelet, indistinct, unlabeled) transform.
 * @author Sean A. Irvine
 */
public class A032291 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    }
    final Sequence s = new DikTransformSequence(toFiniteSequence(), 0);
    for (int k = 1; k < size(); ++k) {
      s.next();
    }
    return s.next();
  }
}
