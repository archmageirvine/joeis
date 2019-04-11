package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040346 Continued fraction for <code>sqrt(366)</code>.
 * @author Georg Fischer
 */
public class A040346 extends PrependSequence {

  /** Construct the sequence. */
  public A040346() {
    super(new PeriodicSequence(7, 1, 1, 1, 2, 12, 2, 1, 1, 1, 7, 38), Z.valueOf(19));
  }
}
