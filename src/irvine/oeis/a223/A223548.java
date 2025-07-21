package irvine.oeis.a223;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A223548 Smallest prime factors for sequence A223546.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A223548 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A223548() {
    super(1, new A223546(), Functions.LPF::z);
  }
}
