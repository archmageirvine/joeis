package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A155473 Numbers of the form x^3+y^5, with x,y&gt;0 and x&lt;&gt;y.
 * @author Sean A. Irvine
 */
public class A155473 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A155473() {
    super(1, 1, 1, (x, y) -> Z.valueOf(x).pow(3).add(Z.valueOf(y).pow(5)));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return x != y;
  }
}

