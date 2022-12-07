package irvine.oeis.a076;

import irvine.oeis.SkipSequence;
import irvine.oeis.a050.A050535;
import irvine.oeis.transform.EulerTransform;

/**
 * A076867 Euler transform of 1, 3, 8, 23, ... (A050535).
 * @author Georg Fischer
 */
public class A076867 extends EulerTransform {

  /** Construct the sequence. */
  public A076867() {
    super(new SkipSequence(new A050535(), 1));
  }
}
