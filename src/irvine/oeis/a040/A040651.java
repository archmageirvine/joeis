package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040651 Continued fraction for sqrt(678).
 * @author Georg Fischer
 */
public class A040651 extends PrependSequence {

  /** Construct the sequence. */
  public A040651() {
    super(new PeriodicSequence(26, 52), Z.valueOf(26));
  }
}
