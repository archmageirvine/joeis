package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040493 Continued fraction for sqrt(516).
 * @author Georg Fischer
 */
public class A040493 extends PrependSequence {

  /** Construct the sequence. */
  public A040493() {
    super(new PeriodicSequence(1, 2, 1, 1, 14, 1, 1, 2, 1, 44), Z.valueOf(22));
  }
}
