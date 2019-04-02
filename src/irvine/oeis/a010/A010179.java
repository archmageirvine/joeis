package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010179 Continued fraction for sqrt(114).
 * @author Sean A. Irvine
 */
public class A010179 extends PrependSequence {

  /** Construct the sequence. */
  public A010179() {
    super(new PeriodicSequence(1, 2, 10, 2, 1, 20), Z.TEN);
  }
}

