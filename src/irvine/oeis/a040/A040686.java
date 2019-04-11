package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040686 Continued fraction for <code>sqrt(713)</code>.
 * @author Georg Fischer
 */
public class A040686 extends PrependSequence {

  /** Construct the sequence. */
  public A040686() {
    super(new PeriodicSequence(1, 2, 2, 1, 4, 6, 2, 6, 4, 1, 2, 2, 1, 52), Z.valueOf(26));
  }
}
