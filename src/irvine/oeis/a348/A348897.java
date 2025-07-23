package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A348897 Numbers of the form (x + y)*(x^2 + y^2).
 * @author Sean A. Irvine
 */
public class A348897 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A348897() {
    super(1, 0, 0, (x, y) -> Z.valueOf(x).square().add(Z.valueOf(y).square()).multiply(x + y));
  }
}
