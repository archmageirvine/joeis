package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065773 Number of divisors of square of true prime powers arising in A065405.
 * @author Sean A. Irvine
 */
public class A065773 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065773() {
    super(new A065405(), k -> Functions.SIGMA0.z(k.square()));
  }
}
