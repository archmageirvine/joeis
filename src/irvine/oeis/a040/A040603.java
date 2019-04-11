package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040603 Continued fraction for <code>sqrt(629)</code>.
 * @author Georg Fischer
 */
public class A040603 extends PrependSequence {

  /** Construct the sequence. */
  public A040603() {
    super(new PeriodicSequence(12, 1, 1, 12, 50), Z.valueOf(25));
  }
}
