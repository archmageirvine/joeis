package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040661 Continued fraction for <code>sqrt(688)</code>.
 * @author Georg Fischer
 */
public class A040661 extends PrependSequence {

  /** Construct the sequence. */
  public A040661() {
    super(new PeriodicSequence(4, 2, 1, 5, 7, 3, 7, 5, 1, 2, 4, 52), Z.valueOf(26));
  }
}
