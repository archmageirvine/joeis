package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040059 Continued fraction for <code>sqrt(68)</code>.
 * @author Georg Fischer
 */
public class A040059 extends PrependSequence {

  /** Construct the sequence. */
  public A040059() {
    super(new PeriodicSequence(4, 16), Z.valueOf(8));
  }
}
