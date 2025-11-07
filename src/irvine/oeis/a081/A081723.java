package irvine.oeis.a081;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a065.A065554;
import irvine.oeis.a065.A065564;

/**
 * A081723 Let b(n)=floor((3/2)^n), c(n)=floor((4/3)^n); sequence gives values of n such that b(n+1)/b(n)=3/2 and c(n+1)/c(n)=4/3.
 * @author Sean A. Irvine
 */
public class A081723 extends IntersectionSequence {

  /** Construct the sequence. */
  public A081723() {
    super(new A065554(), new A065564());
  }
}
