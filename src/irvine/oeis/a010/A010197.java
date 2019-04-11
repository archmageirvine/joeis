package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010197 Continued fraction for <code>sqrt(138)</code>.
 * @author Sean A. Irvine
 */
public class A010197 extends PrependSequence {

  /** Construct the sequence. */
  public A010197() {
    super(new PeriodicSequence(1, 2, 1, 22), Z.valueOf(11));
  }
}

