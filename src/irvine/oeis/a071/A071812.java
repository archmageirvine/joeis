package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A071812 Continued fraction expansion of a constant x where each term is determined by a(n) = floor(1/frac(n*x)), where x=0.283151006074509519...
 * @author Sean A. Irvine
 */
public class A071812 extends CachedSequence {

  /** Construct the sequence. */
  public A071812() {
    super(0, Integer.class, (self, k) -> {
      if (k == 0) {
        return Z.THREE;
      }
      final List<Z> finite = new ArrayList<>();
      for (int j = 0; j < k; ++j) {
        finite.add(self.a(j));
      }
      final Q x = ContinuedFractionUtils.toQ(finite).reciprocal();
      return x.multiply(k + 1).frac().reciprocal().floor();
    });
  }
}
