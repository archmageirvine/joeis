package irvine.oeis.a358;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000247;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A358536 a(n) is the least prime factor of 2^n-n-2.
 * @author Georg Fischer
 */
public class A358536 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A358536() {
    super(3, new A000247().skip(), Functions.LPF::z);
  }
}
