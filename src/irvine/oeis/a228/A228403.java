package irvine.oeis.a228;
// manually deris/essent at 2022-04-28 15:40

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A228403 The number of boundary twigs for complete binary twigs. A twig is a vertex with one edge on the boundary and only one other descendant.
 * @author Georg Fischer
 */
public class A228403 extends A000108 {

  private int mN = 0;

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}
