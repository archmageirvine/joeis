package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040419 Continued fraction for sqrt(440).
 * @author Georg Fischer
 */
public class A040419 extends PrependSequence {

  /** Construct the sequence. */
  public A040419() {
    super(new PeriodicSequence(1, 40), Z.valueOf(20));
  }
}
