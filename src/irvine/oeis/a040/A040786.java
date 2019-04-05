package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040786 Continued fraction for sqrt(815).
 * @author Georg Fischer
 */
public class A040786 extends PrependSequence {

  /** Construct the sequence. */
  public A040786() {
    super(new PeriodicSequence(1, 1, 4, 1, 2, 5, 2, 1, 4, 1, 1, 56), Z.valueOf(28));
  }
}
