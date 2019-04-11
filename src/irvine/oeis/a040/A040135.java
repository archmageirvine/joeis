package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040135 Continued fraction for <code>sqrt(148)</code>.
 * @author Georg Fischer
 */
public class A040135 extends PrependSequence {

  /** Construct the sequence. */
  public A040135() {
    super(new PeriodicSequence(6, 24), Z.valueOf(12));
  }
}
