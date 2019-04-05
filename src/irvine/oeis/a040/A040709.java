package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040709 Continued fraction for sqrt(737).
 * @author Georg Fischer
 */
public class A040709 extends PrependSequence {

  /** Construct the sequence. */
  public A040709() {
    super(new PeriodicSequence(6, 1, 3, 3, 7, 2, 4, 2, 7, 3, 3, 1, 6, 54), Z.valueOf(27));
  }
}
