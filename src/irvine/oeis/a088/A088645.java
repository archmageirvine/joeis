package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088645 a(n) = A088644(n)/n!.
 * @author Georg Fischer
 */
public class A088645 extends FiniteSequence {

  /** Construct the sequence. */
  public A088645() {
    super(1, 5, 17, 42, 84, 139, 199, 249, 276, 276, 251, 209, 161, 115, 77, 48, 29, 16, 9, 5, 2);
  }
}
