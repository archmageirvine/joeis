package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001935;

/**
 * A014605 Partial sums of <code>A001935</code>; at one time this was conjectured to agree with <code>A007478</code>.
 * @author Sean A. Irvine
 */
public class A014605 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014605() {
    super(new PrependSequence(new A001935(), Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO));
  }
}
