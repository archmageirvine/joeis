package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040321 Continued fraction for <code>sqrt(340)</code>.
 * @author Georg Fischer
 */
public class A040321 extends PrependSequence {

  /** Construct the sequence. */
  public A040321() {
    super(new PeriodicSequence(2, 3, 1, 1, 1, 1, 8, 1, 1, 1, 1, 3, 2, 36), Z.valueOf(18));
  }
}
