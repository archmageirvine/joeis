package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040032 Continued fraction for <code>sqrt(39)</code>.
 * @author Georg Fischer
 */
public class A040032 extends PrependSequence {

  /** Construct the sequence. */
  public A040032() {
    super(new PeriodicSequence(4, 12), Z.valueOf(6));
  }
}
