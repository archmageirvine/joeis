package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A345367 a(n) = Sum_{k=0..n} binomial(4*k,k) / (3*k + 1).
 * @author Sean A. Irvine
 */
public class A345367 extends A001113 {

  private int[] mBuffer = new int[10];
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      System.arraycopy(mBuffer, 0, mBuffer, 1, mBuffer.length - 1);
      mBuffer[0] = super.next().intValue();
      ++mM;
      int syndrome = 0;
      for (final int v : mBuffer) {
        syndrome |= 1 << v;
      }
      if (syndrome == 0b1111111111) {
        return Z.valueOf(mM - 10);
      }
    }
  }
}
