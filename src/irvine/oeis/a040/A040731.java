package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040731 Continued fraction for <code>sqrt(759)</code>.
 * @author Georg Fischer
 */
public class A040731 extends PrependSequence {

  /** Construct the sequence. */
  public A040731() {
    super(new PeriodicSequence(1, 1, 4, 1, 1, 54), Z.valueOf(27));
  }
}
