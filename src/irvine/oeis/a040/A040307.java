package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040307 Continued fraction for <code>sqrt(326)</code>.
 * @author Georg Fischer
 */
public class A040307 extends PrependSequence {

  /** Construct the sequence. */
  public A040307() {
    super(new PeriodicSequence(18, 36), Z.valueOf(18));
  }
}
