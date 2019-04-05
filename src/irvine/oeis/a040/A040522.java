package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040522 Continued fraction for sqrt(546).
 * @author Georg Fischer
 */
public class A040522 extends PrependSequence {

  /** Construct the sequence. */
  public A040522() {
    super(new PeriodicSequence(2, 1, 2, 1, 2, 46), Z.valueOf(23));
  }
}
