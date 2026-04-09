package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a001.A001449;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394592 Sum of the distinct prime divisors of C(5*n, n).
 * @author Sean A. Irvine
 */
public class A394592 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394592() {
    super(1, new A001449().skip(), Functions.SOPF::z);
  }
}
