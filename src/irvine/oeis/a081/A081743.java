package irvine.oeis.a081;

import irvine.oeis.DoubledSequence;
import irvine.oeis.a063.A063787;

/**
 * A081743 a(1)=1 then a(n)=a(n/2^k)+1 if n is even and 2^k is the largest power of 2 dividing n, a(n)=a(n-1) otherwise.
 * @author Georg Fischer
 */
public class A081743 extends DoubledSequence {

  /** Construct the sequence. */
  public A081743() {
    super(1, 1, new A063787(), 1);
  }
}
