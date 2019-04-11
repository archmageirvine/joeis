package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040330 Continued fraction for <code>sqrt(349)</code>.
 * @author Georg Fischer
 */
public class A040330 extends PrependSequence {

  /** Construct the sequence. */
  public A040330() {
    super(new PeriodicSequence(1, 2, 7, 7, 2, 1, 36), Z.valueOf(18));
  }
}
