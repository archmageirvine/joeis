package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010148 Continued fraction for <code>sqrt(69)</code>.
 * @author Sean A. Irvine
 */
public class A010148 extends PrependSequence {

  /** Construct the sequence. */
  public A010148() {
    super(new PeriodicSequence(3, 3, 1, 4, 1, 3, 3, 16), Z.EIGHT);
  }
}

