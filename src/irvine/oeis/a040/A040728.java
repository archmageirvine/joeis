package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040728 Continued fraction for sqrt(756).
 * @author Georg Fischer
 */
public class A040728 extends PrependSequence {

  /** Construct the sequence. */
  public A040728() {
    super(new PeriodicSequence(2, 54), Z.valueOf(27));
  }
}
