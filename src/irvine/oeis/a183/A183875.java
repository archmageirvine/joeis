package irvine.oeis.a183;
// Generated by gen_seq4.pl partran at 2022-10-18 22:25

import irvine.oeis.a156.A156017;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A183875 Triangle T(n,k) for A(x)^k=sum(n&gt;=k T(n,k)*x^n), where o.g.f. A(x) satisfies A(x)=(a+b*x*A(x))/(c-d*x*A(x)), a=1,b=2,c=1,d=2.
 * @author Georg Fischer
 */
public class A183875 extends PartitionTransformTriangle {

  /** Construct the sequence. */
  public A183875() {
    super(1, new A156017());
  }
}
