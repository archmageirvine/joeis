package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A279221 Expansion of Product_{k&gt;=1} 1/(1 - x^(k^2*(k+1)/2)).
 * @author Georg Fischer
 */
public class A279221 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A279221() {
    super(0, 1);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * k * (k + 1) / 2);
  }

}
