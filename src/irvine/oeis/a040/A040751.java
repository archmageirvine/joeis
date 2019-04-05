package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040751 Continued fraction for sqrt(779).
 * @author Georg Fischer
 */
public class A040751 extends PrependSequence {

  /** Construct the sequence. */
  public A040751() {
    super(new PeriodicSequence(1, 10, 5, 2, 27, 2, 5, 10, 1, 54), Z.valueOf(27));
  }
}
