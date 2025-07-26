package irvine.oeis.a250;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A250482 Numbers of the form 2^x + y^2, with x and y &gt;=0.
 * @author Sean A. Irvine
 */
public class A250482 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A250482() {
    super(1, 0, 0, (x, y) -> Z.valueOf(y).square().add(Z.TWO.pow(x)));
  }
}

