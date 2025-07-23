package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A076270 Numbers of the form (3^{mr}-1)/(3^r-1) for positive integers m, r.
 * @author Sean A. Irvine
 */
public class A076270 extends TwoParameterFormSequence {

  protected A076270(final Z base) {
    super(1, 1, 1, (m, r) -> {
      if (m == 1 && r != 1) {
        return null;
      }
      final Z t = base.pow(r);
      return t.pow(m).subtract(1).divide(t.subtract(1));
    });
  }

  /** Construct the sequence. */
  public A076270() {
    this(Z.THREE);
  }
}
