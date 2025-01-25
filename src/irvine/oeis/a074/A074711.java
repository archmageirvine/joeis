package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000461;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074711 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074711() {
    super(0, new A000461(), Functions.MOBIUS::z);
  }
}
