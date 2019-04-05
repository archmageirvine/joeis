package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040798 Continued fraction for sqrt(827).
 * @author Georg Fischer
 */
public class A040798 extends PrependSequence {

  /** Construct the sequence. */
  public A040798() {
    super(new PeriodicSequence(1, 3, 7, 1, 27, 1, 7, 3, 1, 56), Z.valueOf(28));
  }
}
