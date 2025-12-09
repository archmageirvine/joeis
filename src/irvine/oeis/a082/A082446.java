package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082446 a(0)=0, a(1)=1, a(2)=0; thereafter, if k&gt;=0 and a block of the first 3*2^k terms is known, then a(3*2^k+i)=1-a(i) for 0&lt;=i&lt;3*2^k.
 * @author Sean A. Irvine
 */
public class A082446 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((Long.bitCount(++mN / 3) + mN % 3) & 1);
  }
}

