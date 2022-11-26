package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.a046.A046644;

/**
 * A318658 Denominators of the sequence whose Dirichlet convolution with itself yields A087003, a(2n) = 0 and a(2n+1) = moebius(2n+1).
 * @author Georg Fischer
 */
public class A318658 extends A046644 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(2n) = 1, a(2n-1) = A046644(2n-1)
    ++mN;
    if ((mN & 1) == 1) {
      return super.next();
    }
    super.next();
    return Z.ONE;
  }
}
