package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040287 Continued fraction for <code>sqrt(305)</code>.
 * @author Georg Fischer
 */
public class A040287 extends PrependSequence {

  /** Construct the sequence. */
  public A040287() {
    super(new PeriodicSequence(2, 6, 2, 34), Z.valueOf(17));
  }
}
