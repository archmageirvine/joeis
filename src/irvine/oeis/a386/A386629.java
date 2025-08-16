package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386629 Values of w in the (2,3)-quartals (m,u,v,w) having m=1; i.e., values of v for solutions to 1 + u^3 = v^2 + w^3, in positive integers, with m&lt;v; see A386627.
 * @author Sean A. Irvine
 */
public class A386629 extends A386627 {

  @Override
  protected Z select(final long u, final long v, final Z w) {
    return w;
  }
}
