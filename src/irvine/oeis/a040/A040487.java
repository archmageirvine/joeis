package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040487 Continued fraction for sqrt(510).
 * @author Georg Fischer
 */
public class A040487 extends PrependSequence {

  /** Construct the sequence. */
  public A040487() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 44), Z.valueOf(22));
  }
}
