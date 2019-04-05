package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040393 Continued fraction for sqrt(414).
 * @author Georg Fischer
 */
public class A040393 extends PrependSequence {

  /** Construct the sequence. */
  public A040393() {
    super(new PeriodicSequence(2, 1, 7, 2, 7, 1, 2, 40), Z.valueOf(20));
  }
}
