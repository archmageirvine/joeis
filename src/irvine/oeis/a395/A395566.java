package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.a004.A004355;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395566 Sum of the distinct prime divisors of C(6*n, n).
 * @author Sean A. Irvine
 */
public class A395566 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A395566() {
    super(1, new A004355().skip(), Functions.SOPF::z);
  }
}
