package irvine.oeis.a236;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052033;

/**
 * A236437 Primes which occur in their proper place in A236174.
 * @author Georg Fischer
 */
public class A236437 extends PrependSequence {

  /** Construct the sequence. */
  public A236437() {
    super(1, new A052033(), 2);
  }
}
