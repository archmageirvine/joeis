package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000108;

/**
 * A014138.
 * @author Sean A. Irvine
 */
public class A014138 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014138() {
    super(new PrependSequence(new SkipSequence(new A000108(), 1), Z.ZERO));
  }
}
