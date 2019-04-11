package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010213 Continued fraction for <code>sqrt(165)</code>.
 * @author Sean A. Irvine
 */
public class A010213 extends PrependSequence {

  /** Construct the sequence. */
  public A010213() {
    super(new PeriodicSequence(1, 5, 2, 5, 1, 24), Z.valueOf(12));
  }
}

