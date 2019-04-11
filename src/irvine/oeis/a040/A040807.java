package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040807 Continued fraction for <code>sqrt(836)</code>.
 * @author Georg Fischer
 */
public class A040807 extends PrependSequence {

  /** Construct the sequence. */
  public A040807() {
    super(new PeriodicSequence(1, 10, 1, 1, 2, 1, 1, 10, 1, 56), Z.valueOf(28));
  }
}
