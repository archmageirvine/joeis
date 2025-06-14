package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A066642 a(n) = floor(n^(n/2)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A066642 extends FloorSequence {

  /** Construct the sequence. */
  public A066642() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).pow(n).sqrt();
  }
}
