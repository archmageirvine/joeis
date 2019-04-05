package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040371 Continued fraction for sqrt(391).
 * @author Georg Fischer
 */
public class A040371 extends PrependSequence {

  /** Construct the sequence. */
  public A040371() {
    super(new PeriodicSequence(1, 3, 2, 2, 1, 1, 2, 19, 2, 1, 1, 2, 2, 3, 1, 38), Z.valueOf(19));
  }
}
