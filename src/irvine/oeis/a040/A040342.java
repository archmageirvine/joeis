package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040342 Continued fraction for <code>sqrt(362)</code>.
 * @author Georg Fischer
 */
public class A040342 extends PrependSequence {

  /** Construct the sequence. */
  public A040342() {
    super(new PeriodicSequence(38), Z.valueOf(19));
  }
}
