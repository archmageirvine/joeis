package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040189 Continued fraction for sqrt(204).
 * @author Georg Fischer
 */
public class A040189 extends PrependSequence {

  /** Construct the sequence. */
  public A040189() {
    super(new PeriodicSequence(3, 1, 1, 6, 1, 1, 3, 28), Z.valueOf(14));
  }
}
