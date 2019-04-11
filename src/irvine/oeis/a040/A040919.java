package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040919 Continued fraction for <code>sqrt(950)</code>.
 * @author Georg Fischer
 */
public class A040919 extends PrependSequence {

  /** Construct the sequence. */
  public A040919() {
    super(new PeriodicSequence(1, 4, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 4, 1, 60), Z.valueOf(30));
  }
}
