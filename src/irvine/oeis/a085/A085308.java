package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A085308 Iterate function described in A085307 (= reverse concatenation of prime factors); a(n) is either (i) the fixed point [=prime] if it exists, (ii) a(n)=1 if no convergence occurs (most even initial values); (iii) a(n)=0 if n=1 or if the iteration results in a nontrivial cycle.
 * @author Sean A. Irvine
 */
public class A085308 extends Sequence1 {

  private static final int HEURISTIC = 100;
  private final DirectSequence mA = new A085307();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final HashSet<Z> seen = new HashSet<>();
    Z t = Z.valueOf(mN);
    while (seen.add(t)) {
      if (t.isProbablePrime()) {
        return t;
      }
      t = mA.a(t);
      if (t.isEven() && t.bitLength() > HEURISTIC) {
        return Z.ONE;
      }
    }
    return Z.ZERO;
  }

  /**
   * Run a specific value.
   * @param args value
   */
  public static void main(final String[] args) {
    final A085308 seq = new A085308();
    seq.mN = Long.parseLong(args[0]) - 1;
    System.out.println(seq.next());
  }
}
