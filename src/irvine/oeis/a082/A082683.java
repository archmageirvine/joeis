package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082683 Smaller of the two prime numbers whose product is A082663(n).
 * @author Sean A. Irvine
 */
public class A082683 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082683() {
    super(new A082663(), Functions.LPF::z);
  }
}
