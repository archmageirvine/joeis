package irvine.oeis.a321;
// manually genetm/genetfg at 2022-02-20 19:55

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A321522 Expansion of Product_{k&gt;=1} (1 + x^k)^((k-1)!).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^((k-1)!))</code>
 * @author Georg Fischer
 */
public class A321522 extends GeneralizedEulerTransform {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A321522() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Functions.FACTORIAL.z((int) (k - 1)).negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
