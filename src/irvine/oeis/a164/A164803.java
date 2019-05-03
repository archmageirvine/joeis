package irvine.oeis.a164;

import irvine.oeis.FiniteSequence;

/**
 * A164803 Arises in enumerating geometric hyperplanes of the near hexagon <code>L_3 x GQ(2,2)</code>.
 * @author Georg Fischer
 */
public class A164803 extends FiniteSequence {

  /** Construct the sequence. */
  public A164803() {
    super(30, 45, 18, 270, 90, 120, 360, 90);
  }
}
