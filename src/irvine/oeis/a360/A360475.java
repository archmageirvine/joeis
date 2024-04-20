package irvine.oeis.a360;

import irvine.math.function.Functions;
import irvine.oeis.a126.A126614;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A360475 Smallest prime factor of (2^prime(n) + 1) / 3.
 * @author Georg Fischer
 */
public class A360475 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A360475() {
    super(2, new A126614(), Functions.LPF::z);
  }
}
