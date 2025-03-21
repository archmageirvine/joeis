package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-18.ack/lambdan at 2025-02-18 23:09

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A378185 a(n) = n + floor(n*r/s) + floor(n*r/t), where r=2^(1/4), s=2^(1/2), t=2^(3/4).
 * @author Georg Fischer
 */
public class A378185 extends LambdaSequence {

  /** Construct the sequence. */
  public A378185() {
    super(1, n -> {
      final CR r = CR.TWO.pow(new Q(1, 4));
      final CR s = CR.SQRT2;
      final CR t = CR.TWO.pow(new Q(3, 4));
      return Z.valueOf(n).add(CR.valueOf(n).multiply(r).divide(s).floor()).add(CR.valueOf(n).multiply(t).divide(s).floor());
    });
  }
}
