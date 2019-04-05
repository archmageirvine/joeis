package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040326 Continued fraction for sqrt(345).
 * @author Georg Fischer
 */
public class A040326 extends PrependSequence {

  /** Construct the sequence. */
  public A040326() {
    super(new PeriodicSequence(1, 1, 2, 1, 6, 1, 2, 1, 1, 36), Z.valueOf(18));
  }
}
