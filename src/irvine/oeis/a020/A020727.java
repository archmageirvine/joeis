package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020727 Pisot sequence P(2,7): a(0)=2, a(1)=7, thereafter a(n+1) is the nearest integer to a(n)^2/a(n-1).
 * @author Sean A. Irvine
 */
public class A020727 extends PisotSequence {

  /** Construct the sequence. */
  public A020727() {
    super(2, 7, Q.ZERO);
  }
}

