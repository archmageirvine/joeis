package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010195 Continued fraction for <code>sqrt(136)</code>.
 * @author Sean A. Irvine
 */
public class A010195 extends PrependSequence {

  /** Construct the sequence. */
  public A010195() {
    super(new PeriodicSequence(1, 1, 1, 22), Z.valueOf(11));
  }
}

