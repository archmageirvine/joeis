package irvine.oeis.a242;
// manually 2024-05-10

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A242570 a(n) = 252 * n.
 * @author Georg Fischer
 */
public class A242570 extends LambdaSequence {

  /** Construct the sequence. */
  public A242570() {
    super(0, n -> Z.valueOf(n).multiply(252));
  }
}
