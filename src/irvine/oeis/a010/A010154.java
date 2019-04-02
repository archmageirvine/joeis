package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010154 Continued fraction for sqrt(76).
 * @author Sean A. Irvine
 */
public class A010154 extends PrependSequence {

  /** Construct the sequence. */
  public A010154() {
    super(new PeriodicSequence(1, 2, 1, 1, 5, 4, 5, 1, 1, 2, 1, 16), Z.EIGHT);
  }
}

