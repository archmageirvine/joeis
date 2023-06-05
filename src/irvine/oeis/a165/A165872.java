package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A165872 Totally multiplicative sequence with a(p) = - 2.
 * @author Georg Fischer
 */
public class A165872 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A165872() {
    super(1, (p, e) -> Z.valueOf(-2).pow(e));
  }
}
