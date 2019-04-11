package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040710 Continued fraction for <code>sqrt(738)</code>.
 * @author Georg Fischer
 */
public class A040710 extends PrependSequence {

  /** Construct the sequence. */
  public A040710() {
    super(new PeriodicSequence(6, 54), Z.valueOf(27));
  }
}
