package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A071788.
 * @author Sean A. Irvine
 */
public class A071789 extends CachedSequence {

  /** Construct the sequence. */
  protected A071789(final Z... initialTerms) {
    super(0, Integer.class, (self, n) -> {
      if (n < initialTerms.length) {
        return initialTerms[n];
      }
      Q sum = Q.ZERO;
      Z t = Z.TEN;
      for (int k = 0; k < n; ++k, t = t.multiply(10)) {
        sum = sum.add(new Q(self.a(k), t));
      }
      return sum.multiply(10L * (n + 1)).floor().mod(Z.TEN);
    });
  }

  /** Construct the sequence. */
  public A071789() {
    this(Z.ONE, Z.TWO, Z.THREE);
  }
}
