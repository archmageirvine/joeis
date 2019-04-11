package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040755 Continued fraction for <code>sqrt(783)</code>.
 * @author Georg Fischer
 */
public class A040755 extends PrependSequence {

  /** Construct the sequence. */
  public A040755() {
    super(new PeriodicSequence(1, 54), Z.valueOf(27));
  }
}
