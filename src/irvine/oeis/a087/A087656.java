package irvine.oeis.a087;

import irvine.oeis.a059.A059975;

/**
 * A087656 Let f be defined on the rationals by f(p/q) =(p+1)/(q+1)=p_{1}/q_{1} where (p_{1},q_{1})=1. Let f^k(p/q)=p_{k}/q_{k} where (p_{k},q_{k})=1. Sequence gives least k such that p_{k}-q_{k} = 1 starting at n.
 * @author Georg Fischer
 */
public class A087656 extends A059975 {

  /** Construct the sequence. */
  public A087656() {
    setOffset(3);
    super.next();
  }

}
