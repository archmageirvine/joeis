package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.a053.A053422;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074908.
 * @author Sean A. Irvine
 */
public class A074910 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074910() {
    super(1, new A053422().skip(), Functions.MOBIUS::z);
  }
}
