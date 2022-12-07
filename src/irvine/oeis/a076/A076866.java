package irvine.oeis.a076;

import irvine.oeis.a050.A050535;
import irvine.oeis.transform.EulerTransform;

/**
 * A076866 Euler transform of 1, 1, 3, 8, 23, ... (A050535).
 * @author Georg Fischer
 */
public class A076866 extends EulerTransform {

  /** Construct the sequence. */
  public A076866() {
    super(new A050535());
  }
}
