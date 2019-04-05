package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040842 Continued fraction for sqrt(872).
 * @author Georg Fischer
 */
public class A040842 extends PrependSequence {

  /** Construct the sequence. */
  public A040842() {
    super(new PeriodicSequence(1, 1, 7, 1, 13, 1, 7, 1, 1, 58), Z.valueOf(29));
  }
}
