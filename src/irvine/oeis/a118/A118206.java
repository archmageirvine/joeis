package irvine.oeis.a118;

import irvine.oeis.a008.A008836;
import irvine.oeis.transform.EulerTransform;

/**
 * A118206 Euler transform of the Liouville function.
 * @author Georg Fischer
 */
public class A118206 extends EulerTransform {

  /** Construct the sequence. */
  public A118206() {
    super(new A008836(), 1);
  }
}
