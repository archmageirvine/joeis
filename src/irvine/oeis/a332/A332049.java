package irvine.oeis.a332;
// manually sumdiv at 2023-04-05 21:59

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A332049 a(n) = (1/2) * Sum_{d|n, d &gt; 1} d * phi(d).
 * @author Georg Fischer
 */
public class A332049 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A332049() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> {
      return (d > 1) ? Functions.PHI.z(Z.valueOf(d)).multiply(d) : Z.ZERO;
    }).divide2();
  }
}
