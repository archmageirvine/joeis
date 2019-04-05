package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040411 Continued fraction for sqrt(432).
 * @author Georg Fischer
 */
public class A040411 extends PrependSequence {

  /** Construct the sequence. */
  public A040411() {
    super(new PeriodicSequence(1, 3, 1, 1, 1, 3, 1, 40), Z.valueOf(20));
  }
}
