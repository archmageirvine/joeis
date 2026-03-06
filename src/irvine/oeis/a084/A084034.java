package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010785;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A084034 Numbers which are a product of repeated-digit numbers A010785.
 * @author Sean A. Irvine
 */
public class A084034 extends PrependSequence {

  /** Construct the sequence. */
  public A084034() {
    super(1, new MultiplicativeClosureSequence(new A010785().skip(2)), Z.ZERO);
  }
}
