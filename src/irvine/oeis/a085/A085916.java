package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A085916 Array T(i,1)=i, T(1,j)=j and T(i,j)=T(i-1,j-1)*T(i,j-1) read by antidiagonals.
 * @author Georg Fischer
 */
public class A085916 extends Triangle {

  /** Construct the sequence. */
  public A085916() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int i, final int j) {
    if (j == 0) {
      return Z.valueOf(i + 1);
    } else if (i == j) {
      return Z.valueOf(j + 1);
    } else {
      return get(i - 1, j).multiply(get(i - 2, j - 1));
    }
  }
}
