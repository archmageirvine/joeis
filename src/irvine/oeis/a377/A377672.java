package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.oeis.a066.A066068;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377672 a(n) is the number of divisors of n^n + n.
 * @author Sean A. Irvine
 */
public class A377672 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377672() {
    super(1, new A066068().skip(), Functions.SIGMA0::z);
  }
}
