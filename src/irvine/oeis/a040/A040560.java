package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040560 Continued fraction for <code>sqrt(585)</code>.
 * @author Georg Fischer
 */
public class A040560 extends PrependSequence {

  /** Construct the sequence. */
  public A040560() {
    super(new PeriodicSequence(5, 2, 1, 4, 1, 2, 5, 48), Z.valueOf(24));
  }
}
