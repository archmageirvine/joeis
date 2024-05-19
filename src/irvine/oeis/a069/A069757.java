package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069757 extends Sequence2 {

  private long mN = 1;

  private static Z rodseth(final Z alpha, final Z beta, final Z gamma) {
    // Reduce the numbers to pairwise coprime
    final Z dAlphaBeta = alpha.gcd(beta);
    final Z dBetaGamma = beta.gcd(gamma);
    final Z dAlphaGamma = alpha.gcd(gamma);
    final Z a = alpha.divide(dAlphaBeta).divide(dAlphaGamma);
    final Z b = beta.divide(dAlphaBeta).divide(dBetaGamma);
    final Z c = gamma.divide(dBetaGamma).divide(dAlphaGamma);

    // Perform Rodseth's main algorithm
    final Z s0 = Z.ONE.equals(a) ? Z.ZERO : b.mod(a).modInverse(a).multiply(c.mod(a)).mod(a);

    final List<Z> s = new ArrayList<>();
    s.add(a);
    s.add(s0); // s0 = index 1

    final List<Z> q = new ArrayList<>();
    q.add(Z.ZERO);

    final List<Z> p = new ArrayList<>();
    p.add(Z.ZERO);
    p.add(Z.ONE); // p_0 = index 1

    while (b.multiply(s.get(s.size() - 1)).subtract(c.multiply(p.get(p.size() - 1))).compareTo(Z.ZERO) > 0) {
      final Z sm1 = s.get(s.size() - 1);
      q.add(s.get(s.size() - 2).add(sm1.subtract(Z.ONE)).divide(sm1)); // q_1 = ceil ( s_{-1}/ s0 )
      s.add(q.get(q.size() - 1).multiply(s.get(s.size() - 1)).subtract(s.get(s.size() - 2))); // s_1 = q_1 * s0 - s_{-1}
      p.add(q.get(q.size() - 1).multiply(p.get(p.size() - 1)).subtract(p.get(p.size() - 2))); // p_1 = q_1 * p_0 - p_{-1}
    }

    final Z pairwiseCoprimeResult = a.negate()
      .add(b.multiply(s.get(s.size() - 2).subtract(Z.ONE)))
      .add(c.multiply(p.get(p.size() - 1).subtract(Z.ONE)))
      .subtract(b.multiply(s.get(s.size() - 1)).min(c.multiply(p.get(p.size() - 2))));

    // Apply Johnson's reduction formula to get the final result
    return dAlphaBeta.multiply(dBetaGamma).multiply(dAlphaGamma).multiply(pairwiseCoprimeResult)
      .add(alpha.multiply(dBetaGamma.subtract(Z.ONE)))
      .add(beta.multiply(dAlphaGamma.subtract(Z.ONE)))
      .add(gamma.multiply(dAlphaBeta.subtract(Z.ONE)));
  }


  @Override
  public Z next() {
    ++mN;
    final Z p1 = Functions.PENTAGONAL.z(mN);
    final Z p2 = Functions.PENTAGONAL.z(mN + 1);
    final Z p3 = Functions.PENTAGONAL.z(mN + 2);
    return rodseth(p1, p2, p3);
  }
}
