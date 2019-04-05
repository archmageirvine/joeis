package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040313 Continued fraction for sqrt(332).
 * @author Georg Fischer
 */
public class A040313 extends PrependSequence {

  /** Construct the sequence. */
  public A040313() {
    super(new PeriodicSequence(4, 1, 1, 8, 1, 1, 4, 36), Z.valueOf(18));
  }
}
