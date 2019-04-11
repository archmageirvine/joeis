package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040006 Continued fraction for <code>sqrt(10)</code>.
 * @author Georg Fischer
 */
public class A040006 extends PrependSequence {

  /** Construct the sequence. */
  public A040006() {
    super(new PeriodicSequence(6), Z.valueOf(3));
  }
}
