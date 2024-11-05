package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.oeis.a066.A066068;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377671 Number of prime factors of n^n+n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A377671 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377671() {
    super(1, new A066068().skip(), Functions.BIG_OMEGA::z);
  }
}
