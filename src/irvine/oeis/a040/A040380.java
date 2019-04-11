package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040380 Continued fraction for <code>sqrt(401)</code>.
 * @author Georg Fischer
 */
public class A040380 extends PrependSequence {

  /** Construct the sequence. */
  public A040380() {
    super(new PeriodicSequence(40), Z.valueOf(20));
  }
}
