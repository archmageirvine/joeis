package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040841 Continued fraction for sqrt(871).
 * @author Georg Fischer
 */
public class A040841 extends PrependSequence {

  /** Construct the sequence. */
  public A040841() {
    super(new PeriodicSequence(1, 1, 19, 5, 1, 5, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 5, 1, 5, 19, 1, 1, 58), Z.valueOf(29));
  }
}
