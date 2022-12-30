package irvine.oeis.a114;
// manually A114853/parm3 at 2022-12-25 18:12

import irvine.math.z.Z;
import irvine.oeis.a007.A007661;

/**
 * A114863 a(n) = floor(n^(n/3)/n!!!).
 * @author Georg Fischer
 */
public class A114863 extends A114853 {

  private int mN = 0;

  /** Construct the sequence. */
  public A114863() {
    super(new A007661(), 3);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 2) ? Z.ZERO : result;
  }
}
