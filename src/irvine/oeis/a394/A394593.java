package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a004.A004368;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394593 Sum of the distinct prime divisors of C(7*n, n).
 * @author Sean A. Irvine
 */
public class A394593 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394593() {
    super(1, new A004368().skip(), Functions.SOPF::z);
  }
}
