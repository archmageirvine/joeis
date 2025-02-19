package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075425 Number of steps to reach 1 starting with n and iterating the map n -&gt;rad(n)-1, where rad(n) is the squarefree kernel of n (A007947).
 * @author Sean A. Irvine
 */
public class A075425 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 1) {
      m = Functions.RAD.l(m) - 1;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
