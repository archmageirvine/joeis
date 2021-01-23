package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002431;

/**
 * A036278 Denominators in Taylor series for cot x.
 * @author Sean A. Irvine
 */
public class A036278 extends A002431 {

  @Override
  protected Z select(final Q v) {
    return v.den();
  }
}

