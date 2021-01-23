package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011829 Number of f-vectors for simplicial complexes of dimension at most 4 on at most n-1 vertices.
 * @author Sean A. Irvine
 */
public class A011829 extends A007695 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 5);
  }
}
