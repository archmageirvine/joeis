package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000378 Sums of three squares: numbers of the form x^2 + y^2 + z^2.
 * @author Sean A. Irvine
 */
public class A000378 extends AbstractSequence {

  /* Construct the sequence. */
  public A000378() {
    super(1);
  }

  long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      while (n != 0 && (n & 3) == 0) {
        n >>= 2;
      }
      if ((n & 7) != 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
