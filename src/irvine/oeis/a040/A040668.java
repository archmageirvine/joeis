package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040668 Continued fraction for sqrt(695).
 * @author Georg Fischer
 */
public class A040668 extends PrependSequence {

  /** Construct the sequence. */
  public A040668() {
    super(new PeriodicSequence(2, 1, 3, 10, 3, 1, 2, 52), Z.valueOf(26));
  }
}
