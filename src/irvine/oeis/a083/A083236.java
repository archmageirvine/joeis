package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-08-02.ack/multrar at 2024-08-02 23:54

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A083236 First order recursion: a(0)=2; a(n) = prime(n) - a(n-1).
 * @author Georg Fischer
 */
public class A083236 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A083236() {
    super(0, (self, n) -> Functions.PRIME.z(n).subtract(self.a(n - 1)), "2");
  }
}
