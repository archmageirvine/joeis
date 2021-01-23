package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001203;

/**
 * A007541 Incrementally largest terms in the continued fraction for Pi-2 (cf. A001203).
 * @author Sean A. Irvine
 */
public class A007541 extends RecordSequence {

  // Strange that this sequence does not start with 3

  /** Construct the sequence. */
  public A007541() {
    super(new PrependSequence(new SkipSequence(new A001203(), 1), Z.ONE));
  }
}
