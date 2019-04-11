package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040385 Continued fraction for <code>sqrt(406)</code>.
 * @author Georg Fischer
 */
public class A040385 extends PrependSequence {

  /** Construct the sequence. */
  public A040385() {
    super(new PeriodicSequence(6, 1, 2, 4, 7, 1, 4, 1, 7, 4, 2, 1, 6, 40), Z.valueOf(20));
  }
}
