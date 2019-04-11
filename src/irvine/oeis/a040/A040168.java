package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040168 Continued fraction for <code>sqrt(182)</code>.
 * @author Georg Fischer
 */
public class A040168 extends PrependSequence {

  /** Construct the sequence. */
  public A040168() {
    super(new PeriodicSequence(2, 26), Z.valueOf(13));
  }
}
