package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040511 Continued fraction for sqrt(535).
 * @author Georg Fischer
 */
public class A040511 extends PrependSequence {

  /** Construct the sequence. */
  public A040511() {
    super(new PeriodicSequence(7, 1, 2, 4, 1, 3, 1, 4, 2, 1, 7, 46), Z.valueOf(23));
  }
}
