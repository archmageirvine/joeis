package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A279224 Expansion of Product_{k&gt;=1} 1/(1 - x^(k*(k+1)*(2*k-1)/2)).
 * @author Georg Fischer
 */
public class A279224 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A279224() {
    super(0, 1);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * (k + 1) * (2 * k - 1) / 2);
  }

}
