package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040749 Continued fraction for <code>sqrt(777)</code>.
 * @author Georg Fischer
 */
public class A040749 extends PrependSequence {

  /** Construct the sequence. */
  public A040749() {
    super(new PeriodicSequence(1, 6, 1, 54), Z.valueOf(27));
  }
}
