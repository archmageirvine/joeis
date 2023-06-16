package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a005.A005117;

/**
 * A053797 Lengths of successive gaps between squarefree numbers.
 * @author Sean A. Irvine
 */
public class A053797 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053797() {
    super(1, new A005117());
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
