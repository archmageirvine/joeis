package irvine.oeis.a108;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a046.A046069;

/**
 * A108129 Riesel problem: let k=2n-1; then a(n)=smallest m &gt;= 1 such that k*2^m-1 is prime, or -1 if no such prime exists.
 * @author Georg Fischer
 */
public class A108129 extends PrependSequence {

  /** Construct the sequence. */
  public A108129() {
    super(new A046069().skip(2), 2, 1);
  }
}
