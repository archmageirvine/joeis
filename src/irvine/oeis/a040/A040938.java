package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040938 Continued fraction for <code>sqrt(970)</code>.
 * @author Georg Fischer
 */
public class A040938 extends PrependSequence {

  /** Construct the sequence. */
  public A040938() {
    super(new PeriodicSequence(6, 1, 9, 1, 1, 9, 1, 6, 62), Z.valueOf(31));
  }
}
