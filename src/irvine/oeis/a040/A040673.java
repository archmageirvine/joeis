package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040673 Continued fraction for sqrt(700).
 * @author Georg Fischer
 */
public class A040673 extends PrependSequence {

  /** Construct the sequence. */
  public A040673() {
    super(new PeriodicSequence(2, 5, 2, 1, 1, 1, 1, 12, 1, 1, 1, 1, 2, 5, 2, 52), Z.valueOf(26));
  }
}
