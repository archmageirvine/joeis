package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040232 Continued fraction for <code>sqrt(248)</code>.
 * @author Georg Fischer
 */
public class A040232 extends PrependSequence {

  /** Construct the sequence. */
  public A040232() {
    super(new PeriodicSequence(1, 2, 1, 30), Z.valueOf(15));
  }
}
