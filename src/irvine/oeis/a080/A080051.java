package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080051 Common factors of 2^p-1 and the p-th Fibonacci number, p prime.
 * @author Sean A. Irvine
 */
public class A080051 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080051() {
    super(1, new A080050(), p -> Functions.GCD.z(Z.ONE.shiftLeft(p.longValueExact()).subtract(1), Functions.FIBONACCI.z(p)));
  }
}
