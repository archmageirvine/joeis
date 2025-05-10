package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a098.A098098;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A383405 Partial sums of the sum of the divisors of the numbers of the form 6*k + 5, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A383405 extends PartialSumSequence {

  /** Construct the sequence. */
  public A383405() {
    super(0, new SimpleTransformSequence(new A098098(), Z.SIX::multiply));
  }
}

