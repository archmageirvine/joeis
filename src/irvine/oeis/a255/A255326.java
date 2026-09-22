package irvine.oeis.a255;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A255326 a(n) gives the number of steps needed to reach zero, when we start from x = n and repeatedly subtract x's squarefree kernel (A007947(x)) from it.
 * @author Sean A. Irvine
 */
public class A255326 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 0) {
      m -= Functions.RAD.l(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

