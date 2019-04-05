package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040768 Continued fraction for sqrt(797).
 * @author Georg Fischer
 */
public class A040768 extends PrependSequence {

  /** Construct the sequence. */
  public A040768() {
    super(new PeriodicSequence(4, 3, 13, 1, 4, 4, 1, 13, 3, 4, 56), Z.valueOf(28));
  }
}
