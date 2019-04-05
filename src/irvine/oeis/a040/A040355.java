package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040355 Continued fraction for sqrt(375).
 * @author Georg Fischer
 */
public class A040355 extends PrependSequence {

  /** Construct the sequence. */
  public A040355() {
    super(new PeriodicSequence(2, 1, 2, 1, 5, 1, 2, 1, 2, 38), Z.valueOf(19));
  }
}
