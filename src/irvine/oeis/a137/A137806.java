package irvine.oeis.a137;

import irvine.oeis.a016.A016813;
import irvine.oeis.transform.EulerTransform;

/**
 * A137806 Euler transform of 1, 5, 9, 13, 17, 21, 25, 29, 33, ... (A016813).
 * @author Georg Fischer
 */
public class A137806 extends EulerTransform {

  /** Construct the sequence. */
  public A137806() {
    super(1, new A016813());
  }
}
