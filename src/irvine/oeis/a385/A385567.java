package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a386.A386728;

/**
 * A385567 allocated for Kolosov Petro.
 * @author Sean A. Irvine
 */
public class A385567 extends A386728 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
