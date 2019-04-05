package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040467 Continued fraction for sqrt(490).
 * @author Georg Fischer
 */
public class A040467 extends PrependSequence {

  /** Construct the sequence. */
  public A040467() {
    super(new PeriodicSequence(7, 2, 1, 4, 4, 4, 1, 2, 7, 44), Z.valueOf(22));
  }
}
