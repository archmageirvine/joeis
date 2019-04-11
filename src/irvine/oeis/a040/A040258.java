package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040258 Continued fraction for <code>sqrt(275)</code>.
 * @author Georg Fischer
 */
public class A040258 extends PrependSequence {

  /** Construct the sequence. */
  public A040258() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 32), Z.valueOf(16));
  }
}
