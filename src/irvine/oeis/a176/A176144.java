package irvine.oeis.a176;
// manually doubled

import irvine.oeis.DoubledSequence;
import irvine.oeis.a164.A164555;

/**
 * A176144 a(2n) = A164555(n). a(2n+1) = A027641(n).
 * @author Georg Fischer
 */
public class A176144 extends DoubledSequence {

  /** Construct the sequence. */
  public A176144() {
    super(0, 2, new A164555(), 1, 1, 1, -1);
  }
}
