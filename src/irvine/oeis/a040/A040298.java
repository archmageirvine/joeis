package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040298 Continued fraction for <code>sqrt(316)</code>.
 * @author Georg Fischer
 */
public class A040298 extends PrependSequence {

  /** Construct the sequence. */
  public A040298() {
    super(new PeriodicSequence(1, 3, 2, 8, 2, 3, 1, 34), Z.valueOf(17));
  }
}
