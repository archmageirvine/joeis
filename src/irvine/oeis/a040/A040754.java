package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040754 Continued fraction for <code>sqrt(782)</code>.
 * @author Georg Fischer
 */
public class A040754 extends PrependSequence {

  /** Construct the sequence. */
  public A040754() {
    super(new PeriodicSequence(1, 26, 1, 54), Z.valueOf(27));
  }
}
