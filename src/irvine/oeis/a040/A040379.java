package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040379 Continued fraction for <code>sqrt(399)</code>.
 * @author Georg Fischer
 */
public class A040379 extends PrependSequence {

  /** Construct the sequence. */
  public A040379() {
    super(new PeriodicSequence(1, 38), Z.valueOf(19));
  }
}
