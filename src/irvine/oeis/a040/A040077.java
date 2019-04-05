package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040077 Continued fraction for sqrt(87).
 * @author Georg Fischer
 */
public class A040077 extends PrependSequence {

  /** Construct the sequence. */
  public A040077() {
    super(new PeriodicSequence(3, 18), Z.valueOf(9));
  }
}
