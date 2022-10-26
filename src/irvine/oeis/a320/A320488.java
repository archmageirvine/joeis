package irvine.oeis.a320;
// manually deris/eulerix 0 at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004104;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320488 Inverse Euler transform of A004104.
 * @author Georg Fischer
 */
public class A320488 extends PrependSequence {

  /** Construct the sequence. */
  public A320488() {
    super(0, new InverseEulerTransform(new A004104()), 1);
  }
}
