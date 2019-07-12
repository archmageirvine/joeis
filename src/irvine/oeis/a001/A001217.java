package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a000.A000165;
import irvine.oeis.a002.A002866;
import irvine.oeis.a003.A003134;

/**
 * A001217 Sorted list of orders of Weyl groups of types <code>A_n, B_n, D_n, E_n, F_4, G_2</code>.
 * @author Sean A. Irvine
 */
public class A001217 implements Sequence {

  private final Sequence mSeq = UnionSequence.createUnion(new A000142(), new A000165(), new A002866(), new A003134(), new FiniteSequence(12, 1152));

  @Override
  public Z next() {
    return mSeq.next();
  }
}
