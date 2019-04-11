package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040787 Continued fraction for <code>sqrt(816)</code>.
 * @author Georg Fischer
 */
public class A040787 extends PrependSequence {

  /** Construct the sequence. */
  public A040787() {
    super(new PeriodicSequence(1, 1, 3, 3, 3, 1, 1, 56), Z.valueOf(28));
  }
}
