package irvine.oeis.a110;
// manually interleave at 2023-04-16 16:45

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a002.A002458;
import irvine.oeis.a037.A037964;

/**
 * A110145 a(n) = Sum_{k=0..n} C(n,k)^2*mod(k,2).
 * @author Georg Fischer
 */
public class A110145 extends AlternatingSequence {

  /** Construct the sequence. */
  public A110145() {
    super(0, new A037964(), new A002458());
  }
}
