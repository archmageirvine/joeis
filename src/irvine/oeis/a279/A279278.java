package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A279278 Expansion of Product_{k&gt;=1} (1 + x^(k*(k+1)*(k+2)/6)).
 * @author Georg Fischer
 */
public class A279278 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A279278() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * (k + 1) * (k + 2) / 6);
  }
}
