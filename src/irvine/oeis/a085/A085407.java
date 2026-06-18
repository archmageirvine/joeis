package irvine.oeis.a085;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a022.A022340;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085407 Runs of zeros in binomial(3k+2,k+1)/(3k+2) modulo 2 (A085405).
 * @author Sean A. Irvine
 */
public class A085407 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085407() {
    super(1, new DifferenceSequence(new A022340()), k -> k.subtract(1));
  }
}
