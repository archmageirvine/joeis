package irvine.oeis.a131;
// Generated by gen_seq4.pl 2024-06-01/multrar at 2024-06-01 22:47

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A131704 a(1)=1, a(n+1) = Sum_{k=1..floor(sqrt(n))} a(floor(k*sqrt(n))).
 * @author Georg Fischer
 */
public class A131704 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A131704() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, Functions.SQRT.i(n - 1), k -> self.a(Functions.SQRT.i(k * k * (n - 1)))), "1");
  }
}
