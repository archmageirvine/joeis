package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040043 Continued fraction for <code>sqrt(51)</code>.
 * @author Georg Fischer
 */
public class A040043 extends PrependSequence {

  /** Construct the sequence. */
  public A040043() {
    super(new PeriodicSequence(7, 14), Z.SEVEN);
  }
}
