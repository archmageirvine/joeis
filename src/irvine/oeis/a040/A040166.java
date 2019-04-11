package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040166 Continued fraction for <code>sqrt(180)</code>.
 * @author Georg Fischer
 */
public class A040166 extends PrependSequence {

  /** Construct the sequence. */
  public A040166() {
    super(new PeriodicSequence(2, 2, 2, 26), Z.valueOf(13));
  }
}
