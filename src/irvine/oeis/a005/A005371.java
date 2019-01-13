package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005371.
 * @author Sean A. Irvine
 */
public class A005371 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Fibonacci.lucas(Fibonacci.lucas(++mN).intValueExact());
  }
}
