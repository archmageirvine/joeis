package irvine.oeis.a320;
// manually deris/eulerix 1 at 2022-10-26 11:22

import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008409;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320729 Inverse Euler transform of A008409.
 * @author Georg Fischer
 */
public class A320729 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320729() {
    super(new SkipSequence(new A008409(), 1));
  }
}
