package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040703 Continued fraction for <code>sqrt(731)</code>.
 * @author Georg Fischer
 */
public class A040703 extends PrependSequence {

  /** Construct the sequence. */
  public A040703() {
    super(new PeriodicSequence(27, 54), Z.valueOf(27));
  }
}
