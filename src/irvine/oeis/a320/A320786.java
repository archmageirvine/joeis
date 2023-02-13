package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a154.A154272;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320786 Inverse Euler transform of {1,0,1,0,0,0,...}.
 * @author Georg Fischer
 */
public class A320786 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320786() {
    super(0, new A154272(), 0, 1);
  }
}
