package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A076826 a(n) = 2*(Sum_{k=0..n} A010060(k)) - n, where A010060 is a Thue-Morse sequence.
 * a(2n) = 2*A010060(n); a(2n+1) = 1.
 * @author Georg Fischer
 */
public class A076826 extends A010060 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? super.next().multiply2() : Z.ONE;
  }
}
