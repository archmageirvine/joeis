package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a065.A065554;
import irvine.oeis.a065.A065564;

/**
 * A081724 Let b(n)=floor((3/2)^n), c(n)=floor((4/3)^n), d(n)=floor((5/4)^n); sequence gives values of n such that b(n+1)/b(n)=3/2, c(n+1)/c(n)=4/3 and d(n+1)/d(n)=5/4.
 * @author Sean A. Irvine
 */
public class A081724 extends IntersectionSequence {

  /** Construct the sequence. */
  public A081724() {
    super(new A065554(), new A065564(), new A065564(new Q(5, 4)));
  }
}
