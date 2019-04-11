package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040911 Continued fraction for <code>sqrt(942)</code>.
 * @author Georg Fischer
 */
public class A040911 extends PrependSequence {

  /** Construct the sequence. */
  public A040911() {
    super(new PeriodicSequence(1, 2, 4, 20, 4, 2, 1, 60), Z.valueOf(30));
  }
}
