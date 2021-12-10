package irvine.oeis.a124;
// manually 2021-01-01

import irvine.oeis.transform.InverseWeighTransform;
import irvine.oeis.a003.A003400;

/**
 * A124059 Number of connected asymmetric graphs with n nodes.
 * @author Georg Fischer
 */
public class A124059 extends InverseWeighTransform {

  /** Construct the sequence. */
  public A124059() {
    super(new A003400());
  }
}
