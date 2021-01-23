package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126652 A 3 X 3 magic square with magic sum 75: the Loh-Shu square A033812 multiplied by 5.
 * @author Georg Fischer
 */
public class A126652 extends FiniteSequence {

  /** Construct the sequence. */
  public A126652() {
    super(40, 5, 30, 15, 25, 35, 20, 45, 10);
  }
}
