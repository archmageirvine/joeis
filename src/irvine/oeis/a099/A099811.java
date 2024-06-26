package irvine.oeis.a099;
// Generated by gen_seq4.pl 2024-04-24/multrar at 2024-04-24 18:19

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A099811 a(n) = a(n-1) XOR Sum_{k=1..n-1} a(k), with a(1)=1, a(2)=3, where XOR is the binary exclusive OR operation.
 * @author Georg Fischer
 */
public class A099811 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A099811() {
    super(1, (self, n) -> self.a(n - 1).xor(Integers.SINGLETON.sum(1, n - 1, k -> self.a(k))), "1, 3");
  }
}
