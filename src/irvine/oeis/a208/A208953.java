package irvine.oeis.a208;

import irvine.oeis.FiniteSequence;

/**
 * A208953 Amounts <code>(in</code> cents) of coins in denominations suggested by Shallit.
 * @author Georg Fischer
 */
public class A208953 extends FiniteSequence {

  /** Construct the sequence. */
  public A208953() {
    super(1, 5, 10, 18, 25, 50);
  }
}
