package irvine.oeis.a321;
// manually genetm/genetfg at 2022-02-20 19:58

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A321520 Expansion of Product_{k&gt;=1} (1 + (k - 1)!*x^k).
 * G.f.: <code>Product_{k&gt;=1} ((1+(k-1)!*x^k))</code>
 * @author Georg Fischer
 */
public class A321520 extends GeneralizedEulerTransform {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A321520() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Functions.FACTORIAL.z((int) (k - 1)).negate();
  }

}
