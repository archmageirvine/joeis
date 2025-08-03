package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a385.A385882;

/**
 * A386627 Values of u in the (2,3)-quartals (m,u,v,w) having m=1; i.e., values of v for solutions to 1 + u^3 = v^2 + w^3, in positive integers, with v &gt; 1; see Comments.
 * @author Sean A. Irvine
 */
public class A386627 extends A385882 {

  /** Construct the sequence. */
  public A386627() {
    super(1, 2, 3);
  }

  @Override
  protected Z select(final long u, final long v, final Z w) {
    return Z.valueOf(u);
  }
}
