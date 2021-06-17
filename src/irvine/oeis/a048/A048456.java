package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a047.A047844;

/**
 * A048456 First terms from generation 1 onwards.
 * @author Sean A. Irvine
 */
public class A048456 extends A047844 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(1L, ++mN);
  }
}
