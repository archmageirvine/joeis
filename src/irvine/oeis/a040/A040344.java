package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040344 Continued fraction for <code>sqrt(364)</code>.
 * @author Georg Fischer
 */
public class A040344 extends PrependSequence {

  /** Construct the sequence. */
  public A040344() {
    super(new PeriodicSequence(12, 1, 2, 3, 1, 8, 1, 3, 2, 1, 12, 38), Z.valueOf(19));
  }
}
