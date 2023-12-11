package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A007553 Logarithmic transform of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A007553 extends LogarithmicTransformSequence {

  /** Construct the sequence. */
  public A007553() {
    super(new A000045(), 0);
  }

  @Override
  public Z next() {
    return Z.ONE.max(super.next().abs());
  }
}
