package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040745 Continued fraction for <code>sqrt(773)</code>.
 * @author Georg Fischer
 */
public class A040745 extends PrependSequence {

  /** Construct the sequence. */
  public A040745() {
    super(new PeriodicSequence(1, 4, 13, 1, 2, 2, 1, 13, 4, 1, 54), Z.valueOf(27));
  }
}
