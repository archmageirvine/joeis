package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A126032 Numbers of the form b^m/2 for even b and odd m &gt; 2.
 * @author Sean A. Irvine
 */
public class A126032 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A126032() {
    super(1, 1, 1, (b, m) -> Z.valueOf(2 * b).pow(2 * m + 1).divide2());
  }
}

