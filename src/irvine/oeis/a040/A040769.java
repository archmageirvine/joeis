package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040769 Continued fraction for <code>sqrt(798)</code>.
 * @author Georg Fischer
 */
public class A040769 extends PrependSequence {

  /** Construct the sequence. */
  public A040769() {
    super(new PeriodicSequence(4, 56), Z.valueOf(28));
  }
}
