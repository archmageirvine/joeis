package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040774 Continued fraction for <code>sqrt(803)</code>.
 * @author Georg Fischer
 */
public class A040774 extends PrependSequence {

  /** Construct the sequence. */
  public A040774() {
    super(new PeriodicSequence(2, 1, 27, 1, 2, 56), Z.valueOf(28));
  }
}
