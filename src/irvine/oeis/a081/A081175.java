package irvine.oeis.a081;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A081175 Numbers of the form Sum_{i=1..k} i^j, j &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A081175 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A081175() {
    super(1, 1, 1, (k, j) -> k > 1 || j == 1 ? Integers.SINGLETON.sum(1, k.intValue(), i -> Z.valueOf(i).pow(j)) : null);
  }
}

