package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011830 f-vectors for simplicial complexes of dimension at most 5 on at most n-1 vertices.
 * @author Sean A. Irvine
 */
public class A011830 extends A007695 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 6);
  }
}
