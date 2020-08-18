package irvine.oeis.a111;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A111376 Let <code>qf(a,q) = Product(1-a*q^j,j=0..infinity);</code> g.f. is <code>qf(q^3,q^7)*qf(q^5,q^7)*qf(q^6,q^7)/(qf(q,q^7)*qf(q^2,q^7)*qf(q^4,q^7))</code>.
 * @author Georg Fischer
 */
public class A111376 extends EulerTransform {

  /** Construct the sequence. */
  public A111376() {
    super(new PeriodicSequence(1, 1, -1, 1, -1, -1, 0), 1);
  }
}
