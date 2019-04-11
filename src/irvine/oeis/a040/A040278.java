package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040278 Continued fraction for <code>sqrt(296)</code>.
 * @author Georg Fischer
 */
public class A040278 extends PrependSequence {

  /** Construct the sequence. */
  public A040278() {
    super(new PeriodicSequence(4, 1, 7, 1, 4, 34), Z.valueOf(17));
  }
}
