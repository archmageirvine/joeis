package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040332 Continued fraction for sqrt(351).
 * @author Georg Fischer
 */
public class A040332 extends PrependSequence {

  /** Construct the sequence. */
  public A040332() {
    super(new PeriodicSequence(1, 2, 1, 3, 2, 2, 2, 3, 1, 2, 1, 36), Z.valueOf(18));
  }
}
