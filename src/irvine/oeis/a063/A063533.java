package irvine.oeis.a063;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A063533 Hypotenuses of special Pythagorean triples constructed from twin primes as follows: {u, w}={p,p+2}; side a=2p(p+2), side b=(p+2)^2-p^2 and the terms of sequence are values of c=a(n)=p^2+(p+2)^2=phi(a/2)+1+sigma(a/2)+1.
 * @author Sean A. Irvine
 */
public class A063533 extends Combiner {

  /** Construct the sequence. */
  public A063533() {
    super(new A001359(), new A006512(), (a, b) -> a.square().add(b.square()));
  }
}
