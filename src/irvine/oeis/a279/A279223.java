package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A279223 Expansion of Product_{k&gt;=1} 1/(1 - x^(k*(k+1)*(5*k-2)/6)).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^(k*k))^2)</code>
 * @author Georg Fischer
 */
public class A279223 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A279223() {
    super(0, 1);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * (k + 1) * (5 * k - 2) / 6);
  }

}
