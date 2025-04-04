package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-18.ack/lambdan at 2025-02-18 23:09

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A379408 a(n) = n + floor(n*s/r) + floor(n*t/r), where r = u^(1/4); s = u^(1/2); t = u^(3/4), u = golden ratio (A001622).
 * @author Georg Fischer
 */
public class A379408 extends LambdaSequence {

  /** Construct the sequence. */
  public A379408() {
    super(1, n -> {
      final CR u = CR.PHI;
      final CR r = u.pow(new Q(1, 4));
      final CR s = u.pow(new Q(1, 2));
      final CR t = u.pow(new Q(3, 4));
      return Z.valueOf(n).add(CR.valueOf(n).multiply(s).divide(r).floor()).add(CR.valueOf(n).multiply(t).divide(r).floor());
    });
  }
}
