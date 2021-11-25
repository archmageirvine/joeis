package irvine.oeis.a173;
// manually euleras at 2021-11-23 12:41

import irvine.oeis.EulerTransform;
import irvine.oeis.a051.A051064;

/**
 * A173241 Euler transform of A051064, the ruler function sequence for k=3.
 * @author Georg Fischer
 */
public class A173241 extends EulerTransform {

  /** Construct the sequence. */
  public A173241() {
    super(new A051064(), 1);
  }
}
