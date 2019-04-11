package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040558 Continued fraction for <code>sqrt(583)</code>.
 * @author Georg Fischer
 */
public class A040558 extends PrependSequence {

  /** Construct the sequence. */
  public A040558() {
    super(new PeriodicSequence(6, 1, 7, 5, 4, 5, 7, 1, 6, 48), Z.valueOf(24));
  }
}
