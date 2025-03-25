package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A076175 Denominator of Sum_{i+j+k=n, i,j,k&gt;=1} (i*j)/k.
 * @author Sean A. Irvine
 */
public class A076175 extends A076174 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

