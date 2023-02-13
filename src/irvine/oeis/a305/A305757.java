package irvine.oeis.a305;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a007.A007240;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A305757 Inverse Euler transform of q*(j-720) where j is j-function (A000521).
 * @author Georg Fischer
 */
public class A305757 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A305757() {
    super(1, new A007240(), 1);
    next();
  }
}
