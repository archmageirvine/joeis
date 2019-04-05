package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040239 Continued fraction for sqrt(255).
 * @author Georg Fischer
 */
public class A040239 extends PrependSequence {

  /** Construct the sequence. */
  public A040239() {
    super(new PeriodicSequence(1, 30), Z.valueOf(15));
  }
}
