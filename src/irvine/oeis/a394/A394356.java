package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394356 a(n) = numerator m of the prime-fraction m/n that most closely approximates p/q as in A394354.
 * @author Sean A. Irvine
 */
public class A394356 extends A394354 {

  @Override
  protected Z select(final Q pq, final Q mn) {
    return mn.num();
  }
}
