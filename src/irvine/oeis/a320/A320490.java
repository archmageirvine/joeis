package irvine.oeis.a320;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a004.A004106;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320490 Inverse Euler transform of A004106.
 * @author Georg Fischer
 */
public class A320490 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320490() {
    super(0, new A004106(), 1);
  }
}
