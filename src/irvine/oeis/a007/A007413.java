package irvine.oeis.a007;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000069;

/**
 * A007413 A squarefree (or Thue-Morse) ternary sequence: closed under 1-&gt;123, 2-&gt;13, 3-&gt;2. Start with 1.
 * @author Sean A. Irvine
 */
public class A007413 extends DifferenceSequence {

  /** Construct the sequence. */
  public A007413() {
    super(new A000069());
  }
}
