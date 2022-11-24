package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A129110 A transformation of the Catalan sequence.
 * @author Georg Fischer
 */
public class A129110 extends A000108 {

  private int mN = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    // a(2n)=1. a(2n+1)= 1+(-1)^n*C(n+1), where C=A000108.
    ++mN;
    if ((mN & 1) == 0) {
      return Z.ONE;
    }
    final int n = mN / 2;
    return super.next().multiply(((n & 1) == 0) ? 1 : -1).add(1);
  }
}
