package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.DikTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A032291 Shifts left 2 places under "DIK" (bracelet, indistinct, unlabeled) transform.
 * @author Sean A. Irvine
 */
public class A032291 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    }
    final Sequence s = new DikTransformSequence(new FiniteSequence(this), 0);
    for (int k = 1; k < size(); ++k) {
      s.next();
    }
    return s.next();
  }
}
