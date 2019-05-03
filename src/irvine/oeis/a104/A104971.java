package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104971 Numbers with 4 distinct digits <code>{1,2,3,4}</code> such that all adjacent <code>digits(as</code> well as first and last digits) are coprime.
 * @author Georg Fischer
 */
public class A104971 extends FiniteSequence {

  /** Construct the sequence. */
  public A104971() {
    super(1234, 1432, 2143, 2341, 3214, 3412, 4123, 4321);
  }
}
