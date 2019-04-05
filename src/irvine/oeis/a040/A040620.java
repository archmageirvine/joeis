package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040620 Continued fraction for sqrt(646).
 * @author Georg Fischer
 */
public class A040620 extends PrependSequence {

  /** Construct the sequence. */
  public A040620() {
    super(new PeriodicSequence(2, 2, 2, 50), Z.valueOf(25));
  }
}
