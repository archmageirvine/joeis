package irvine.oeis.a320;
// manually deris/eulerix 1 at 2022-10-26 11:22

import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004010;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320686 Inverse Euler transform of A004010.
 * @author Georg Fischer
 */
public class A320686 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320686() {
    super(new SkipSequence(new A004010(), 1));
  }
}
