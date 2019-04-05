package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040884 Continued fraction for sqrt(915).
 * @author Georg Fischer
 */
public class A040884 extends PrependSequence {

  /** Construct the sequence. */
  public A040884() {
    super(new PeriodicSequence(4, 60), Z.valueOf(30));
  }
}
