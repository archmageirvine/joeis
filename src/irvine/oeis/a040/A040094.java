package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040094 Continued fraction for <code>sqrt(105)</code>.
 * @author Georg Fischer
 */
public class A040094 extends PrependSequence {

  /** Construct the sequence. */
  public A040094() {
    super(new PeriodicSequence(4, 20), Z.valueOf(10));
  }
}
