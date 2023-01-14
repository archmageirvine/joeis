package irvine.oeis.a000;
// manually 2023-01-13; eulerper 1 at 2020-11-29; period: -24

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000594 Ramanujan's tau function (or Ramanujan numbers, or tau numbers).
 * @author Georg Fischer
 */
public class A000594 extends EulerTransform {

  /** Construct the sequence. */
  public A000594() {
    super(1, new PeriodicSequence(-24), 1);
  }
}
