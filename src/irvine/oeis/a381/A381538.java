package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A381538 Numbers of the form m^(m^k).
 * @author Sean A. Irvine
 */
public class A381538 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A381538() {
    super(1, 1, 1, (k, m) -> k != 1 || m == 1 ? Z.valueOf(k).pow(Z.valueOf(k).pow(m)) : null);
  }
}
