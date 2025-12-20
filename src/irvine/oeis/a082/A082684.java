package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082684 Larger of the two prime numbers whose product is A082663(n).
 * @author Sean A. Irvine
 */
public class A082684 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082684() {
    super(new A082663(), Functions.GPF::z);
  }
}
