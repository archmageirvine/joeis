package irvine.oeis.a195;
// Generated by gen_seq4.pl 2024-08-02.ack/multrar at 2024-08-02 23:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A195187 a(1)=1 and recursively a(n+1) = R(1+(a(n))^3).
 * @author Georg Fischer
 */
public class A195187 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A195187() {
    super(1, (self, n) -> Functions.REVERSE.z(10, Z.ONE.add(self.a(n - 1).pow(3))), "1");
  }
}
