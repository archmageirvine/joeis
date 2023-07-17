package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003136;

/**
 * A024610 Position of n^2 in A003136.
 * @author Sean A. Irvine
 */
public class A024610 extends A003136 {

  /** Construct the sequence. */
  public A024610() {
    super(0);
  }

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    final Z m2 = Z.valueOf(++mM).square();
    while (true) {
      ++mN;
      if (super.next().equals(m2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
