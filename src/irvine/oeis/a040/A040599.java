package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040599 Continued fraction for <code>sqrt(624)</code>.
 * @author Georg Fischer
 */
public class A040599 extends PrependSequence {

  /** Construct the sequence. */
  public A040599() {
    super(new PeriodicSequence(1, 48), Z.valueOf(24));
  }
}
