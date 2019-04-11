package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040273 Continued fraction for <code>sqrt(291)</code>.
 * @author Georg Fischer
 */
public class A040273 extends PrependSequence {

  /** Construct the sequence. */
  public A040273() {
    super(new PeriodicSequence(17, 34), Z.valueOf(17));
  }
}
