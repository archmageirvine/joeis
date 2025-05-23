package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-16.ack/lambdan at 2025-02-16 22:50

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A379510 a(n) = n + floor(n*r/t) + floor(n*s/t), where r=2^(1/4), s=2^(1/2), t=2^(3/4).
 * @author Georg Fischer
 */
public class A379510 extends LambdaSequence {

  /** Construct the sequence. */
  public A379510() {
    super(1, n -> {
      final CR r = CR.TWO.pow(new Q(1, 4));
      final CR s = CR.TWO.pow(new Q(1, 2));
      final CR t = CR.TWO.pow(new Q(3, 4));
      return Z.valueOf(n).add(CR.valueOf(n).multiply(r).divide(t).floor()).add(CR.valueOf(n).multiply(s).divide(t).floor());
    });
  }
}
