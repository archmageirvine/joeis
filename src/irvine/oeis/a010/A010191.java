package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010191 Continued fraction for <code>sqrt(131)</code>.
 * @author Sean A. Irvine
 */
public class A010191 extends PrependSequence {

  /** Construct the sequence. */
  public A010191() {
    super(new PeriodicSequence(2, 4, 11, 4, 2, 22), Z.valueOf(11));
  }
}

