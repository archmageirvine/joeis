package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040319 Continued fraction for sqrt(338).
 * @author Georg Fischer
 */
public class A040319 extends PrependSequence {

  /** Construct the sequence. */
  public A040319() {
    super(new PeriodicSequence(2, 1, 1, 2, 36), Z.valueOf(18));
  }
}
