package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a349.A349919;

/**
 * A393238 Number of transitive relations on an n-set with at most two ordered pairs.
 * @author Sean A. Irvine
 */
public class A393238 extends A349919 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().add(Z.valueOf(++mN).square()).add(1);
  }
}
