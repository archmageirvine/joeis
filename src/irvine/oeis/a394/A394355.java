package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394355 a(n) = numerator p of the prime-fraction p/q that most closely approximates m/n as in A394354.
 * @author Sean A. Irvine
 */
public class A394355 extends A394354 {

  @Override
  protected Z select(final Q pq, final Q mn) {
    return pq.num();
  }
}
