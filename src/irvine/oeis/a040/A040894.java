package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040894 Continued fraction for <code>sqrt(925)</code>.
 * @author Georg Fischer
 */
public class A040894 extends PrependSequence {

  /** Construct the sequence. */
  public A040894() {
    super(new PeriodicSequence(2, 2, 2, 2, 60), Z.valueOf(30));
  }
}
