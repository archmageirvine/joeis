package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040752 Continued fraction for <code>sqrt(780)</code>.
 * @author Georg Fischer
 */
public class A040752 extends PrependSequence {

  /** Construct the sequence. */
  public A040752() {
    super(new PeriodicSequence(1, 12, 1, 54), Z.valueOf(27));
  }
}
