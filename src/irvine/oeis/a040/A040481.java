package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040481 Continued fraction for sqrt(504).
 * @author Georg Fischer
 */
public class A040481 extends PrependSequence {

  /** Construct the sequence. */
  public A040481() {
    super(new PeriodicSequence(2, 4, 2, 44), Z.valueOf(22));
  }
}
