package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006454 Solution to a Diophantine equation: each term is a triangular number and each term <code>+ 1</code> is a square.
 * @author Sean A. Irvine
 */
public class A006454 extends A006452 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square().subtract(1);
  }
}
