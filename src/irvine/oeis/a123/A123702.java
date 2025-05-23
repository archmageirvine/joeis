package irvine.oeis.a123;
// Generated by gen_seq4.pl 2025-04-28.ack/multrar at 2025-04-28 23:36

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A123702 a(1)=a(2)=1. For n &gt;= 3, a(n) = (product{k=1 to n-1} a(k)) - (sum{j=1 to n-1} a(j)).
 * @author Georg Fischer
 */
public class A123702 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A123702() {
    super(1, (self, n) -> self.a(n - 1).multiply(self.a(n - 2)).multiply(self.a(n - 1).subtract(1)).divide(self.a(n - 2).subtract(1)), "1, 1,-1,-2");
  }
}
