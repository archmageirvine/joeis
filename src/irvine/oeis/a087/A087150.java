package irvine.oeis.a087;

import java.util.ArrayList;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;

/**
 * A087150 Monotonically increasing sequence of least positive integers, a(1)=1, such that the self-convolution produces all squares.
 * @author Sean A. Irvine
 */
public class A087150 extends Sequence1 {

  private final List<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA.size();
    if (n == 0) {
      mA.add(Z.ONE);
      return Z.ONE;
    }
    Z t = mA.get(n - 1);
    while (true) {
      t = t.add(1);
      mA.add(t);
      final ConvolutionSequence conv = new ConvolutionSequence(new FiniteSequence(mA));
      for (int k = 0; k < n; ++k) {
        conv.next();
      }
      if (Predicates.SQUARE.is(conv.next())) {
        return t;
      }
      mA.remove(n);
    }
  }
}
