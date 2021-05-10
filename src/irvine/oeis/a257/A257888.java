package irvine.oeis.a257;
// manually; 2021-05-10

import irvine.math.z.Z;
import irvine.oeis.a002.A002055;

/**
 * Number of nonintersecting (or self-avoiding) rook paths of length 2n+2 joining opposite corners of an n X n grid.
 * @author Georg Fischer
 */
public class A257888 extends A002055 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
