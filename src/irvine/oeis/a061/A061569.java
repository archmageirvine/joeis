package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000041;
import irvine.oeis.a060.A060840;

/**
 * A061569 Number of irreducible representations of the symmetric group S_n such that their degree is divisible by 3.
 * @author Sean A. Irvine
 */
public class A061569 extends Combiner {

  /** Construct the sequence. */
  public A061569() {
    super(1, new A000041().skip(1), new A060840(), SUBTRACT);
  }
}

