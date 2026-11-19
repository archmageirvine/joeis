package irvine.oeis.a351;

import irvine.math.z.Z;
import irvine.oeis.a059.A059441;

/**
 * A351263 Triangle read by rows: T(n,k) is the number of oriented graphs on n labeled nodes whose underlying graph is k-regular, k = 0..n-1.
 * @author Gregory Morse
 */
public class A351263 extends A059441 {
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return super.next().shiftLeft((long) mN * mM / 2);
  }
}
