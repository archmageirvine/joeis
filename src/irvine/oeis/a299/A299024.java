package irvine.oeis.a299;
// manually 2025-01-01/weightraf at 2025-01-01 20:30

import irvine.oeis.a032.A032153;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A299024 Number of compositions of n whose standard factorization into Lyndon words has distinct strict compositions as factors.
 * @author Georg Fischer
 */
public class A299024 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A299024() {
    super(1, new A032153());
    next();
  }
}
