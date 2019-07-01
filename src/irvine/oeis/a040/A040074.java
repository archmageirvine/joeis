package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040074 Continued fraction for <code>sqrt(84)</code>.
 * @author Georg Fischer
 */
public class A040074 extends PrependSequence {

  /** Construct the sequence. */
  public A040074() {
    super(new PeriodicSequence(6, 18), Z.NINE);
  }
}
