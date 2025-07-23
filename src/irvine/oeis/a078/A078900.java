package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A078900 Generalized Fermat numbers of the form (k+1)^2^m + k^2^m, with m&gt;0.
 * @author Sean A. Irvine
 */
public class A078900 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A078900() {
    super(1, 1, 1, (k, m) -> Z.valueOf(k + 1).pow(1L << m).add(Z.valueOf(k).pow(1L << m)));
  }
}
