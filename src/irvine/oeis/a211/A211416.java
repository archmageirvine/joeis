package irvine.oeis.a211;

import irvine.math.z.Z;

/**
 * A211416 Number of self-inverse 2 X 2 matrices with all terms in {-n,..., 0,...,n}.
 * @author Georg Fischer
 */
public class A211416 extends A211415 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().add(++mN == 0 ? 0 : 2);
  }
}
