package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040753 Continued fraction for <code>sqrt(781)</code>.
 * @author Georg Fischer
 */
public class A040753 extends PrependSequence {

  /** Construct the sequence. */
  public A040753() {
    super(new PeriodicSequence(1, 17, 1, 1, 1, 5, 1, 1, 4, 1, 1, 5, 1, 1, 1, 17, 1, 54), Z.valueOf(27));
  }
}
