package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040719 Continued fraction for sqrt(747).
 * @author Georg Fischer
 */
public class A040719 extends PrependSequence {

  /** Construct the sequence. */
  public A040719() {
    super(new PeriodicSequence(3, 54), Z.valueOf(27));
  }
}
