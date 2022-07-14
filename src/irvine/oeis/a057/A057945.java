package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002262;

/**
 * A057945 Number of triangular numbers needed to represent n with greedy algorithm.
 * @author Sean A. Irvine
 */
public class A057945 extends A002262 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    }
    return super.next().add(1);
  }
}
