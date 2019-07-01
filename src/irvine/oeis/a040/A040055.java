package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040055 Continued fraction for <code>sqrt(63)</code>.
 * @author Georg Fischer
 */
public class A040055 extends PrependSequence {

  /** Construct the sequence. */
  public A040055() {
    super(new PeriodicSequence(1, 14), Z.SEVEN);
  }
}
