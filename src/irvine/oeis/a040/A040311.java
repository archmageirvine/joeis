package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040311 Continued fraction for sqrt(330).
 * @author Georg Fischer
 */
public class A040311 extends PrependSequence {

  /** Construct the sequence. */
  public A040311() {
    super(new PeriodicSequence(6, 36), Z.valueOf(18));
  }
}
