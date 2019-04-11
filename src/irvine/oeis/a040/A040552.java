package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040552 Continued fraction for <code>sqrt(577)</code>.
 * @author Georg Fischer
 */
public class A040552 extends PrependSequence {

  /** Construct the sequence. */
  public A040552() {
    super(new PeriodicSequence(48), Z.valueOf(24));
  }
}
