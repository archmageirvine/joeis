package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040833 Continued fraction for sqrt(863).
 * @author Georg Fischer
 */
public class A040833 extends PrependSequence {

  /** Construct the sequence. */
  public A040833() {
    super(new PeriodicSequence(2, 1, 1, 1, 7, 1, 3, 3, 5, 29, 5, 3, 3, 1, 7, 1, 1, 1, 2, 58), Z.valueOf(29));
  }
}
