package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040041 Continued fraction for <code>sqrt(48)</code>.
 * @author Georg Fischer
 */
public class A040041 extends PrependSequence {

  /** Construct the sequence. */
  public A040041() {
    super(new PeriodicSequence(1, 12), Z.valueOf(6));
  }
}
