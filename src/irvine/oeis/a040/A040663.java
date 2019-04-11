package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040663 Continued fraction for <code>sqrt(690)</code>.
 * @author Georg Fischer
 */
public class A040663 extends PrependSequence {

  /** Construct the sequence. */
  public A040663() {
    super(new PeriodicSequence(3, 1, 2, 1, 3, 52), Z.valueOf(26));
  }
}
