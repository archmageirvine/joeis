package irvine.oeis.a227;
// manually deris/essent at 2022-04-28 15:40

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A227127 The Akiyama-Tanigawa algorithm applied to 1/(1,2,3,5,... old prime numbers). Reduced numerators of the second row.
 * @author Georg Fischer
 */
public class A227127 extends A001223 {

  private int mN = -1;

  /** Construct the sequence. */
  public A227127() {
    super(0);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    } else if (mN == 2) {
      return Z.TWO;
    }
    return super.next().multiply(mN + 1);
  }
}
