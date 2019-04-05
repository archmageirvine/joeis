package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040465 Continued fraction for sqrt(488).
 * @author Georg Fischer
 */
public class A040465 extends PrependSequence {

  /** Construct the sequence. */
  public A040465() {
    super(new PeriodicSequence(11, 44), Z.valueOf(22));
  }
}
