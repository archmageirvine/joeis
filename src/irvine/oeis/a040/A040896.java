package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040896 Continued fraction for <code>sqrt(927)</code>.
 * @author Georg Fischer
 */
public class A040896 extends PrependSequence {

  /** Construct the sequence. */
  public A040896() {
    super(new PeriodicSequence(2, 4, 5, 3, 5, 4, 2, 60), Z.valueOf(30));
  }
}
