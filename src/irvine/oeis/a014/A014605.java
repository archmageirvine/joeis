package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001935;

/**
 * A014605 Partial sums of A001935; at one time this was conjectured to agree with A007478.
 * @author Sean A. Irvine
 */
public class A014605 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014605() {
    super(new PrependSequence(new A001935(), Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO));
  }
}
