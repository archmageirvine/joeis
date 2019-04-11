package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040733 Continued fraction for <code>sqrt(761)</code>.
 * @author Georg Fischer
 */
public class A040733 extends PrependSequence {

  /** Construct the sequence. */
  public A040733() {
    super(new PeriodicSequence(1, 1, 2, 2, 1, 1, 54), Z.valueOf(27));
  }
}
