package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011832 f-vectors for simplicial complexes of dimension at most 7 on at most n-1 vertices.
 * @author Sean A. Irvine
 */
public class A011832 extends A007695 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 8);
  }
}
