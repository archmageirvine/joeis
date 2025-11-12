package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006466;

/**
 * A081769 a(n)-th term of the continued fraction for Sum_{k&gt;=0} 1/2^(2^k) is 2.
 * @author Sean A. Irvine
 */
public class A081769 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081769() {
    super(1, new A006466(), Z.TWO::equals);
  }
}

