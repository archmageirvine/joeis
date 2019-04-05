package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040328 Continued fraction for sqrt(347).
 * @author Georg Fischer
 */
public class A040328 extends PrependSequence {

  /** Construct the sequence. */
  public A040328() {
    super(new PeriodicSequence(1, 1, 1, 2, 4, 1, 17, 1, 4, 2, 1, 1, 1, 36), Z.valueOf(18));
  }
}
