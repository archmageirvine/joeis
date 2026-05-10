package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.a005.A005810;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395515 Sum of the distinct prime divisors of C(4*n, n).
 * @author Sean A. Irvine
 */
public class A395515 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A395515() {
    super(1, new A005810().skip(), Functions.SOPF::z);
  }
}
