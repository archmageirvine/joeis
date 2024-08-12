package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A071796 Denominators of a(n+1) = Sum_{k=1..n} a'(n/k), a(1)=1, where a'(x)=a(x) if x integer and is linearly interpolated otherwise.
 * @author Sean A. Irvine
 */
public class A071796 extends A071795 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
