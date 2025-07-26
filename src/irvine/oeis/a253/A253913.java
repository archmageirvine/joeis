package irvine.oeis.a253;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A253913 Numbers of the form m^k + m, with m &gt;= 0 and k &gt; 1.
 * @author Sean A. Irvine
 */
public class A253913 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A253913() {
    super(1, 0, 2, (m, k) -> m <= 1 && k > 2 ? null : Z.valueOf(m).pow(k).add(m));
  }
}

