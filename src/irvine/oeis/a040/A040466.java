package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040466 Continued fraction for sqrt(489).
 * @author Georg Fischer
 */
public class A040466 extends PrependSequence {

  /** Construct the sequence. */
  public A040466() {
    super(new PeriodicSequence(8, 1, 4, 1, 1, 1, 3, 2, 1, 2, 14, 2, 1, 2, 3, 1, 1, 1, 4, 1, 8, 44), Z.valueOf(22));
  }
}
