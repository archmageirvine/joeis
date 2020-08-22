package irvine.oeis.a030;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A030275 Denominators of sequence {b(1), b(2),...} which when COMPOSED with itself gives {1,2,3,...}.
 * @author Sean A. Irvine
 */
public class A030275 extends A030274 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
