package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040327 Continued fraction for sqrt(346).
 * @author Georg Fischer
 */
public class A040327 extends PrependSequence {

  /** Construct the sequence. */
  public A040327() {
    super(new PeriodicSequence(1, 1, 1, 1, 36), Z.valueOf(18));
  }
}
