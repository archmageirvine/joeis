package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084654 Smallest prime factor of pseudoprimes in A084653.
 * @author Sean A. Irvine
 */
public class A084654 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084654() {
    super(new A084653(), Functions.LPF::z);
  }
}
