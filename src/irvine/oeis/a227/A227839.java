package irvine.oeis.a227;
// manually valuation/valuat at 2022-03-16 18:05

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a005.A005132;

/**
 * A227839 3^a(n) is the highest power of 3 dividing A005132(n).
 * @author Georg Fischer
 */
public class A227839 extends A005132 {

  /** Construct the sequence. */
  public A227839() {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(super.next(), Z.THREE));
  }
}
