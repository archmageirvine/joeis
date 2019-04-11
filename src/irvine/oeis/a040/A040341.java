package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040341 Continued fraction for <code>sqrt(360)</code>.
 * @author Georg Fischer
 */
public class A040341 extends PrependSequence {

  /** Construct the sequence. */
  public A040341() {
    super(new PeriodicSequence(1, 36), Z.valueOf(18));
  }
}
