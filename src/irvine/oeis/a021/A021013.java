package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021013 Pisot sequence P(7,11), a(0)=7, a(1)=11, a(n+1) is the nearest integer to a(n)^2/a(n-1). Agrees with A021014 only for n &lt;= 20.
 * @author Sean A. Irvine
 */
public class A021013 extends PisotLSequence {

  /** Construct the sequence. */
  public A021013() {
    super(7, 11, Q.HALF.negate());
  }
}

